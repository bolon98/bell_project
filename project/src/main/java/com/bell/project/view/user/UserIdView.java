package com.bell.project.view.user;

/**
 * Отображение данных по идентификатору
 */
public class UserIdView {
    public Integer id;
    public String firstName;
    public String secondName;
    public String middleName;
    public String position;
    public String phone;
    public String docName;
    public Integer docNumber;
    public String docDate;
    public String citizenshipName;
    public Integer citizenshipCode;
    public boolean isIdentified;

    public UserIdView() {
    }

    public UserIdView(Integer id, String firstName, String secondName, String middleName, String position, String phone, String docName, Integer docNumber, String docDate, String citizenshipName, Integer citizenshipCode, boolean isIdentified) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.citizenshipName = citizenshipName;
        this.citizenshipCode = citizenshipCode;
        this.isIdentified = isIdentified;
    }
}
