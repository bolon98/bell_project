package com.bell.project.view.office;

/**
 * Отображение данных
 */
public class OfficeListView {
    public int id;
    public String name;
    public boolean as_active;

    public OfficeListView() {
    }

    public OfficeListView(int id, String name, boolean as_active) {
        this.id = id;
        this.name = name;
        this.as_active = as_active;
    }
}
