package com.bell.project.model;

import javax.persistence.*;


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
    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    /**
     * Фамилия
     */
    @Column(name = "secondName", length = 50, nullable = false)
    private String secondName;

    /**
     * Отчество
     */
    @Column(name = "middleName", length = 50, nullable = false)
    private String middleName;

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
     * Идентификатор страны
     */
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries country;

    /**
     * Идентификация
     */
    @Column(name = "is_identified")
    private Boolean isIdentified;

    /**
     * Идентификатор офиса
     */
    @OneToOne
    @JoinColumn(name = "office_id")
    private Office office;

    /**
     * документ пользователя
     */
    @OneToOne
    @JoinColumn(name = "user_doc_id")
    private UserDoc userDoc;

    /**
     * Конструктор для hibernate
     */
    public User() {
    }

    public User(String firstName, String secondName, String middleName, String position, String phone, Countries country, Boolean isIdentified, Office office, UserDoc userDoc) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.country = country;
        this.isIdentified = isIdentified;
        this.office = office;
        this.userDoc = userDoc;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public UserDoc getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(UserDoc userDoc) {
        this.userDoc = userDoc;
    }
}
