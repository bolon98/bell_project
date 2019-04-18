package com.bell.project.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Сотрудник
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * Имя
     */
    @Column(name = "furst_name", length = 50, nullable = false)
    private String first_name;

    /**
     * Фамилия
     */
    @Column(name = "second_name", length = 50, nullable = false)
    private String second_name;

    /**
     * Отчество
     */
    @Column(name = "middle_name", length = 50, nullable = false)
    private String middle_name;

    /**
     * Должность
     */
    @Column(name = "position", length = 50, nullable = false)
    private String position;

    /**
     * Телефон
     */
    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    /**
     * Идентификатор документа
     */
    @Column(name = "doc_id")
    private Integer doc_id;

    /**
     * Номер документа
     */
    @Column(name = "doc_number")
    private Integer doc_number;

    /**
     * Дата документа
     */
    @Column(name = "doc_date")
    @Temporal(TemporalType.DATE)
    private Date doc_date;

    /**
     * Идентиыфикатор страны
     */
    @Column(name = "country_id")
    private Integer country_id;

    /**
     * Идентиыфикация
     */
    @Column(name = "is_identified")
    private Boolean is_identified;

    /**
     * Идентиыфикатор офиса
     */
    @Column(name = "office_id")
    private Integer office_id;

    /**
     * Конструктор для hibernate
     */
    public User() {
    }

    public User(String first_name, String second_name, String middle_name, String position, String phone, Integer doc_id, Integer doc_number, Date doc_date, Integer country_id, Boolean is_identified, Integer office_id) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.middle_name = middle_name;
        this.position = position;
        this.phone = phone;
        this.doc_id = doc_id;
        this.doc_number = doc_number;
        this.doc_date = doc_date;
        this.country_id = country_id;
        this.is_identified = is_identified;
        this.office_id = office_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(Integer doc_id) {
        this.doc_id = doc_id;
    }

    public Integer getDoc_number() {
        return doc_number;
    }

    public void setDoc_number(Integer doc_number) {
        this.doc_number = doc_number;
    }

    public Date getDoc_date() {
        return doc_date;
    }

    public void setDoc_date(Date doc_date) {
        this.doc_date = doc_date;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Boolean getIs_identified() {
        return is_identified;
    }

    public void setIs_identified(Boolean is_identified) {
        this.is_identified = is_identified;
    }

    public Integer getOffice_id() {
        return office_id;
    }

    public void setOffice_id(Integer office_id) {
        this.office_id = office_id;
    }
}
