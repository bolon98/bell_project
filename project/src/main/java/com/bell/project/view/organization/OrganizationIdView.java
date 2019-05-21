package com.bell.project.view.organization;

/**
 * Отображение данных по идентификатору
 */
public class OrganizationIdView {
    public int id;
    public String name;
    public String full_name;
    public String inn;
    public String kpp;
    public String address;
    public String phone;
    public boolean isActive;

    public OrganizationIdView() {
    }

    public OrganizationIdView(int id, String name, String full_name, String inn, String kpp, String address, String phone, boolean isActive) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }
}
