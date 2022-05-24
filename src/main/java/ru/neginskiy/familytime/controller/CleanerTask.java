package ru.neginskiy.familytime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.neginskiy.familytime.domain.CalendarEvent;
import ru.neginskiy.familytime.service.CalendarEventService;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CleanerTask {

    private final CalendarEventService eventService;

    /**
     * Каждый день в 4 утра стираются все задачи до этого
     * (чтобы не перегружать пока H2)
     */
    @Scheduled(cron = "0 0 4 * * *")
    public void removedOldEvents() {
        List<CalendarEvent> events = eventService.findAll();
        events.stream()
                .filter(event -> event
                        .getEndDate()
                        .isBefore(LocalDateTime.now()
                                .truncatedTo(ChronoUnit.DAYS)))
                .forEach(eventService::delete);
    }
}
