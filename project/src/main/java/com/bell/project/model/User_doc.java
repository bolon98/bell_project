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
    private Date date;

    /**
     * Тип документа
     */
    @OneToOne
    @JoinColumn(name = "doc_type_id", nullable = false)
    private Doc_type doc_type_id;

    /**
     * Документ сотрудника
     */
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    /**
     * Конструктор для hibernate
     */
    public User_doc() {
    }

    public User_doc(Integer number, Date date, Doc_type doc_type_id, User user_id) {
        this.number = number;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doc_type getDoc_type_id() {
        return doc_type_id;
    }

    public void setDoc_type_id(Doc_type doc_type_id) {
        this.doc_type_id = doc_type_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}


