package com.bell.project.filter.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса обновления пользователей
 */
public class UserInUpdate {
    @NotBlank(message = "Поле идентификатора должно быть заполнено")
    @Min(value = 1, message = "Введеное идентификатор не соответствует ограничению по количеству символов")
    public Integer id;

    @Min(value = 1, message = "Введенный идентификатор не соответствует ограничению по количеству символов")
    public Integer officeId;

    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String firstName;

    @Size(min = 2, max = 50, message = "Введенная фамилия не соответствует ограничению по количеству символов")
    public String secondName;

    @Size(min = 2, max = 50, message = "Введенное отчество не соответствует ограничению по количеству символов")
    public String middleName;

    @NotBlank(message = "Поле доложности должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенная должность не соответствует ограничению по количеству символов")
    public String position;

    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    @Size(min = 2, max = 50, message = "Введенное название документа не соответствует ограничению по количеству символов")
    public String docName;

    @Size(min = 4, max = 50, message = "Введенный номер документа не соответствует ограничению по количеству символов")
    public Integer docNumber;

    @Size(min = 6, max = 12, message = "Введенная дата документа не соответствует ограничению по количеству символов")
    public String docDate;

    @Min(value = 1, message = "Введенный код гражданства не соответствует ограничению по количеству символов")
    public Integer citizenshipCode;

    public boolean isIdentified;

    public UserInUpdate() {
    }

    public UserInUpdate(Integer id, Integer officeId, String firstName, String secondName, String middleName, String position, String phone, String docName, Integer docNumber, String docDate, Integer citizenshipCode, boolean isIdentified) {
        this.id = id;
        this.officeId = officeId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.citizenshipCode = citizenshipCode;
        this.isIdentified = isIdentified;
    }
}
