package com.bell.project.view.organization;

/**
 * Отображение данных
 */
public class OrganizationListView {
    public Integer id;
    public String name;
    public Boolean isActive;

    public OrganizationListView() {
    }

    public OrganizationListView(Integer id, String name, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }
}
