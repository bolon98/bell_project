package com.bell.project.view.organization;

/**
 * Отображение данных
 */
public class OrganizationListView {
    private Integer id;
    private String name;
    private Boolean isActive;

    public OrganizationListView() {
    }

    public OrganizationListView(Integer id, String name, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
