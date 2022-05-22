package ru.neginskiy.familytime.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calendar_event")
@Entity
public class CalendarEvent {

    @Id
    @Column(name = "id")
    private String id;

    /**
     * Описание события, кто, с кем, куда, что именно
     */
    @Column(name = "descriptor")
    private String descriptor;

    /**
     * Начало события
     */
    @Column(name = "start_date")
    private LocalDateTime startDate;

    /**
     * Окончание события
     */
    @Column(name = "end_date")
    private LocalDateTime endDate;

    /**
     * Точно ли состоится событие, true - точно, false - нужно обсудить
     */
    @Column(name = "is_exactly")
    private Boolean isExactly;

    /**
     * Семья, у которой планируется событие
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "family_id")
    private Family family;

    // TODO добавить потом участников (пользователь добавляет отдельно, потом добавляет сам кого нужно к событию)
    // private List<String> participants;
}
