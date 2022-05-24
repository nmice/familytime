package ru.neginskiy.familytime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.neginskiy.familytime.domain.CalendarEvent;
import ru.neginskiy.familytime.domain.User;
import ru.neginskiy.familytime.service.CalendarEventService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EventCalendarController {
    private final CalendarEventService eventService;

    @GetMapping("/")
    public String events(Model model) {
        List<CalendarEvent> events = eventService.findAll();
        model.addAttribute("events", events);
        return "events";
    }

    @GetMapping("/addevent")
    public String addEvent(Model model) {
        model.addAttribute("event", new CalendarEvent(new User()));
        return "edit";
    }

    @PostMapping("/addevent")
    public String addEvent(@ModelAttribute CalendarEvent event) {
        eventService.addOrSaveEvent(event);
        return "redirect:/";
    }

    @PostMapping("/delete/{event}")
    public String deleteEvent(@PathVariable CalendarEvent event) {
        eventService.delete(event);
        return "redirect:/";
    }

    @GetMapping("/edit/{event}")
    public String editEvent(@PathVariable CalendarEvent event, Model model) {
        model.addAttribute("event", event);
        return "edit";
    }
}
