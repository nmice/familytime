package ru.neginskiy.familytime.service;

import ru.neginskiy.familytime.domain.CalendarEvent;

import java.util.List;

public interface CalendarEventService {

    void addOrSaveEvent(CalendarEvent event);

    void delete(CalendarEvent event);

    List<CalendarEvent> findAll();
}
