package ru.neginskiy.familytime.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {

    @Id
    @Column(name = "id")
    private String id;

    /**
     * Логин пользователя
     */
    @Column(name = "login")
    private String login;

    /**
     * Пароль пользователя
     */
    @Column(name = "pass")
    private String pass;

    /**
     * Имя пользователя
     */
    @Column(name = "name")
    private String name;

    /**
     * Семья, в которую входит пользователь
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "family_id")
    private Family family;
}
