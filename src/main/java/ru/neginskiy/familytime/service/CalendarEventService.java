package ru.neginskiy.familytime.service;

import ru.neginskiy.familytime.domain.CalendarEvent;

import java.util.List;

public interface CalendarEventService {

    CalendarEvent save(CalendarEvent author);

    CalendarEvent getById(String id);

    List<CalendarEvent> getAll();
}
