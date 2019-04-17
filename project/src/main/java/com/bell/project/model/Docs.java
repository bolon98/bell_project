package com.bell.project.model;

import javax.persistence.*;

/**
 * Документы
 */
@Entity
@Table(name = "Docs")
public class Docs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    /**
     * Название документа
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Код документа
     */
    @Column(name = "code", nullable = false)
    private Integer code;

    /**
     * Конструктор для hibernate
     */
    public Docs() {
    }

    public Docs(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
