package com.bell.project.view.organization;

/**
 * Отображение данных
 */
public class OrganizationListView {
    public Integer id;
    public String name;
    public boolean asActive;

    public OrganizationListView() {
    }

    public OrganizationListView(Integer id, String name, boolean asActive) {
        this.id = id;
        this.name = name;
        this.asActive = asActive;
    }
}
