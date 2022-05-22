package ru.neginskiy.familytime.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CalendarEvent {

    /**
     * Описание события, кто, с кем, куда, что именно
     */
    private String desc;

    /**
     * Начало события
     */
    private LocalDateTime startDate;

    /**
     * Окончание события
     */
    private LocalDateTime endDate;

    /**
     * Точно ли состоится событие, true - точно, false - нужно обсудить
     */
    private Boolean isExactly;

    // TODO добавить потом участников (пользователь добавляет отдельно, потом добавляет сам кого нужно к событию)
    // private List<String> eventParticipants;
}
