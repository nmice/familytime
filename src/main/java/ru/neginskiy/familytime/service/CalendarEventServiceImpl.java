package ru.neginskiy.familytime.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neginskiy.familytime.domain.CalendarEvent;
import ru.neginskiy.familytime.repository.CalendarEventRepository;

import java.util.List;

@Service
public class CalendarEventServiceImpl implements CalendarEventService {

    private final CalendarEventRepository eventRepository;

    public CalendarEventServiceImpl(CalendarEventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    @Transactional
    public CalendarEvent save(CalendarEvent author) {
        return eventRepository.save(author);
    }

    @Override
    @Transactional(readOnly = true)
    public CalendarEvent getById(String id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("CalendarEvent with id %s not found", id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<CalendarEvent> getAll() {
        return eventRepository.findAll();
    }
}
