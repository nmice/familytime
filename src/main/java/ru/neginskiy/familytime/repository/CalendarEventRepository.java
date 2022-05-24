package ru.neginskiy.familytime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neginskiy.familytime.domain.CalendarEvent;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
}
