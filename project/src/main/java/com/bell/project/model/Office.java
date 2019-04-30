package com.bell.project.model;

import javax.persistence.*;

/**
 * Office
 */
@Entity
@Table(name = "Office")
public class Office {

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
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Адрес
     */
    @Column(name = "address", length = 50, nullable = false)
    private String address;

    /**
     * Телефон
     */
    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    /**
     * Активность
     */
    @Column(name = "is_active")
    private Boolean is_active;

    /**
     * Идентификатор организации
     */
    @ManyToOne
    @JoinColumn(name = "org_id", nullable = false)
    private Organization org_id;

    /**
     * Конструктор для hibernate
     */
    public Office() {
    }

    public Office(String name, String address, String phone, Boolean is_active, Organization org_id) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.is_active = is_active;
        this.org_id = org_id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Organization getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Organization org_id) {
        this.org_id = org_id;
    }
}
