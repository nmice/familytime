package ru.neginskiy.familytime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neginskiy.familytime.domain.CalendarEvent;

import java.util.List;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
    List<CalendarEvent> findAllByOrderByStartDateAsc();
}
