package com.bell.project.model;

import javax.persistence.*;

/**
 * Документы
 */
@Entity
@Table(name = "Doc_type")
public class Doc_type {

    /**
     * Код документа
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_code")
    private Integer id_code;

    /**
     * Название документа
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Конструктор для hibernate
     */
    public Doc_type() {
    }

    public Doc_type(Integer id_code, String name) {
        this.id_code = id_code;
        this.name = name;
    }

    public Integer getId_code() {
        return id_code;
    }

    public void setId_code(Integer id_code) {
        this.id_code = id_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
