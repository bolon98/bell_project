package com.bell.project.view.office;

/**
 * Отображение данных
 */
public class OfficeListView {
    public Integer id;
    public String name;
    public boolean asActive;

    public OfficeListView() {
    }

    public OfficeListView(int id, String name, boolean asActive) {
        this.id = id;
        this.name = name;
        this.asActive = asActive;
    }
}
