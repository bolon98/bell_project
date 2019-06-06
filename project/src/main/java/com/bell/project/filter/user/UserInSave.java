package com.bell.project.filter.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Отображение данных запроса из добавлении пользователя
 */
public class UserInSave {
    @NotBlank(message = "Поле идентификатора оффиса должно быть заполнено")
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

    @Min(value = 1, message = "Введенный код документа не соответствует ограничению по количеству символов")
    public Integer docCode;

    @Size(min = 2, max = 50, message = "Введенное название документа не соответствует ограничению по количеству символов")
    public String docName;

    @Size(min = 4, max = 50, message = "Введенный номер документа не соответствует ограничению по количеству символов")
    public Integer docNumber;

    @Size(min = 6, max = 12, message = "Введенная дата документа не соответствует ограничению по количеству символов")
    public Date docDate;

    @Min(value = 1, message = "Введенный код гражданства не соответствует ограничению по количеству символов")
    public Integer citizenshipCode;

    public Boolean isIdentified;

    public UserInSave() {
    }

    public UserInSave(Integer officeId, String firstName, String secondName, String middleName, String position, String phone, Integer docCode, String docName, Integer docNumber, Date docDate, Integer citizenshipCode, Boolean isIdentified) {
        this.officeId = officeId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docCode = docCode;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.citizenshipCode = citizenshipCode;
        this.isIdentified = isIdentified;
    }
}
