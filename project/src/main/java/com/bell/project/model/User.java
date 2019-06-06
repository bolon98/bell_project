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
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Countries countryId;

    /**
     * Идентификация
     */
    @Column(name = "is_identified")
    private Boolean isIdentified;

    /**
     * Идентификатор офиса
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id")
    private Office officeId;

    /**
     * документ пользователя
     */
    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_doc_id")
    private UserDoc userDoc;

    /**
     * Конструктор для hibernate
     */
    public User() {
    }

    public User(String firstName, String secondName, String middleName, String position, String phone, Countries countryId, Boolean isIdentified, Office officeId, UserDoc userDoc) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.countryId = countryId;
        this.isIdentified = isIdentified;
        this.officeId = officeId;
        this.userDoc = userDoc;
    }

    public Integer getId() {
        return id;
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

    public Countries getCountryId() {
        return countryId;
    }

    public void setCountryId(Countries countryId) {
        this.countryId = countryId;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

    public Office getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Office officeId) {
        this.officeId = officeId;
    }

    public UserDoc getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(UserDoc userDoc) {
        this.userDoc = userDoc;
    }
}
