package com.bell.project.filter.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса из списка сотрудников
 */
public class UserFilter {
    @NotBlank(message = "Поле идентификатора оффиса должно быть заполнено")
    @Min(value = 1, message = "Введенный идентификатор не соответствует ограничению по количеству символов")
    public Integer office;

    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенное имя не соответствует ограничению по количеству символов")
    public String firstName;

    @NotBlank(message = "Поле фамилии должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенная фамилия не соответствует ограничению по количеству символов")
    public String secondName;

    @NotBlank(message = "Поле отчества должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенное отчество не соответствует ограничению по количеству символов")
    public String middleName;

    @NotBlank(message = "Поле доложности должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенная должность не соответствует ограничению по количеству символов")
    public String position;

    @NotBlank(message = "Поле код документа должно быть заполнено")
    @Min(value = 1, message = "Введенный код документа не соответствует ограничению по количеству символов")
    public Integer docCode;

    @NotBlank(message = "Поле код гражданства должно быть заполнено")
    @Min(value = 1, message = "Введенный код гражданства не соответствует ограничению по количеству символов")
    public Integer citizenshipCode;

    public UserFilter() {
    }

    public UserFilter(Integer office, String firstName, String secondName, String middleName, String position, Integer docCode, Integer citizenshipCode) {
        this.office = office;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.docCode = docCode;
        this.citizenshipCode = citizenshipCode;
    }
}
