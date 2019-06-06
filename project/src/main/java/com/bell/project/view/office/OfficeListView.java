package com.bell.project.view.office;

/**
 * Отображение данных
 */
public class OfficeListView {
    private Integer id;
    private String name;
    private Boolean asActive;

    public OfficeListView() {
    }

    public OfficeListView(Integer id, String name, Boolean asActive) {
        this.id = id;
        this.name = name;
        this.asActive = asActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isAsActive() {
        return asActive;
    }

    public void setAsActive(Boolean asActive) {
        this.asActive = asActive;
    }
}
