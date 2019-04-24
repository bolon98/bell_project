package com.bell.project.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Документы
 */
@Entity
@Table(name = "User_doc")
public class User_doc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    /**
     * Номер документа
     */
    @Column(name = "number", nullable = false)
    private Integer number;

    /**
     * Дата документа
     */
    @Column(name = "date", nullable = false)
    private Date code;

    /**
     * Тип документа
     */
    @Column(name = "doc_type_id", nullable = false)
    private Integer doc_type_id;

    /**
     * Документ сотрудника
     */
    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    /**
     * Конструктор для hibernate
     */
    public User_doc() {
    }

    public User_doc(Integer number, Date code, Integer doc_type_id, Integer user_id) {
        this.number = number;
        this.code = code;
        this.doc_type_id = doc_type_id;
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCode() {
        return code;
    }

    public void setCode(Date code) {
        this.code = code;
    }

    public Integer getDoc_type_id() {
        return doc_type_id;
    }

    public void setDoc_type_id(Integer doc_type_id) {
        this.doc_type_id = doc_type_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}


