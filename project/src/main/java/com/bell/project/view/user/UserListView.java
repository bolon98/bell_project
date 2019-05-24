package com.bell.project.view.user;

/**
 * Отображение данных
 */
public class UserListView {
    public Integer id;
    public String firstName;
    public String secondName;
    public String middleName;
    public String position;

    public UserListView() {
    }

    public UserListView(Integer id, String firstName, String secondName, String middleName, String position) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
    }
}
