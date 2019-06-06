package com.bell.project.model;

import javax.persistence.*;

/**
 * Страны
 */
@Entity
@Table(name = "Countries")
public class Countries {

    @Id
    @Column(name = "Id")
    private Integer id;

    /**
     * Название страны
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Код страны
     */
    @Column(name = "code", nullable = false)
    private Integer code;

    /**
     * Конструктор для hibernate
     */
    public Countries() {
    }

    public Countries(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
