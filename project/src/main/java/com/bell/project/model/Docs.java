package com.bell.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Документы
 */
@Entity
@Table(name = "Docs")
public class Docs {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Название документа
     */

    private String name;

    /**
     * Код документа
     */

    private Integer code;

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
