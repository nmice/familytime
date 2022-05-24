package ru.neginskiy.familytime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neginskiy.familytime.domain.CalendarEvent;
import ru.neginskiy.familytime.domain.User;
import ru.neginskiy.familytime.repository.CalendarEventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalendarEventServiceImpl implements CalendarEventService {

    private final CalendarEventRepository eventRepository;
    private final UserService userService;

    @Override
    @Transactional
    public void delete(CalendarEvent event) {
        eventRepository.delete(event);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CalendarEvent> findAll() {
        return eventRepository.findAll();
    }

    @Override
    @Transactional
    public void addOrSaveEvent(CalendarEvent event) {
        User user = userService.findByName(event.getUser().getName());
        if (user == null) user = new User(event.getUser().getName());
        event.setUser(user);
        eventRepository.save(event);
    }
}
