package com.bell.project.view.organization;

/**
 * Отображение данных
 */
public class OrganizationListView {
    public int id;
    public String name;
    public boolean asActive;

    public OrganizationListView() {
    }

    public OrganizationListView(int id, String name, boolean asActive) {
        this.id = id;
        this.name = name;
        this.asActive = asActive;
    }
}
