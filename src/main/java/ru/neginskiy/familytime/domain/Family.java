package ru.neginskiy.familytime.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "family")
@Entity
public class Family {

    @Id
    @Column(name = "id")
    private String id;

    /**
     * Фамилия семьи
     */
    @Column(name = "name")
    private String name;
}
