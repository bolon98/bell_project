package com.bell.project.view.office;

/**
 * Отображение данных по идентификатору
 */
public class OfficeIdView {
    public int id;
    public String name;
    public String address;
    public String phone;
    public boolean is_active;

    public OfficeIdView() {
    }

    public OfficeIdView(int id, String name, String address, String phone, boolean is_active) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.is_active = is_active;
    }
}
