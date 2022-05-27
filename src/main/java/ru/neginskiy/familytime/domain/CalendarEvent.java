package ru.neginskiy.familytime.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calendar_event")
@Entity
public class CalendarEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Описание события
     */
    @Column(name = "descriptor")
    private String descriptor;

    /**
     * Начало события
     */
    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startDate;

    /**
     * Окончание события
     */
    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endDate;

    /**
     * Точно ли состоится событие, true - точно, false - нужно обсудить
     */
    @Column(name = "is_exactly")
    private Boolean isExactly;

    /**
     * Пользователь, который завел событие
     */
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public CalendarEvent(User user) {
        this.user = user;
    }

    // TODO добавить потом участников (пользователь добавляет отдельно, потом добавляет сам кого нужно к событию)
    // private List<String> participants;
}
