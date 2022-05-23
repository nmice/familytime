package ru.neginskiy.familytime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neginskiy.familytime.domain.CalendarEvent;
import ru.neginskiy.familytime.service.CalendarEventService;

@RestController
public class Controller {

    private final CalendarEventService calendarEventService;

    public Controller(CalendarEventService calendarEventService) {
        this.calendarEventService = calendarEventService;
    }

    @GetMapping("/event/{id}")
    public CalendarEvent getEvent(@PathVariable String id) {
        return calendarEventService.getById(id);
    }
}
