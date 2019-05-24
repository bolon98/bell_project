package com.bell.project.model;

import javax.persistence.*;
import java.util.Date;


/**
 * Документы
 */
@Entity
@Table(name = "User_doc")
public class UserDoc {

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
    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    private Date date;

    /**
     * Тип документа
     */
    @OneToOne
    @JoinColumn(name = "doc_type_id", nullable = false)
    private DocType docType;

    /**
     * Конструктор для hibernate
     */
    public UserDoc() {
    }

    public UserDoc(Integer number, Date date, DocType docType) {
        this.number = number;
        this.date = date;
        this.docType = docType;
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

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }
}


