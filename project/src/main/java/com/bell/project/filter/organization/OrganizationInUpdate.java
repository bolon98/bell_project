package com.bell.project.filter.organization;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса обновления организаций
 */
public class OrganizationInUpdate {
    @NotNull(message = "Поле идентификатора должно быть заполнено")
    @Min(value = 1, message = "Введенный  идентификатор не соответствует ограничению по количеству символов")
    public Integer id;

    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @NotBlank(message = "Поле полное имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное полное имя не соответствует ограничению по количеству символов")
    public String fullName;

    @NotBlank(message = "Поле ИНН должно быть заполнено")
    @Size(min = 12, max = 12, message = "Введенный ИНН не соответствует ограничению по количеству символов")
    public String inn;

    @NotBlank(message = "Поле КПП должно быть заполнено")
    @Size(min = 9, max = 9, message = "Введенный КПП не соответствует ограничению по количеству символов")
    public String kpp;

    @NotBlank(message = "Поле адрес должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенный адрес не соответствует ограничению по количеству символов")
    public String address;

    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    public Boolean isActive;

    public OrganizationInUpdate() {
    }

    public OrganizationInUpdate(Integer id, String name, String fullName, String inn, String kpp, String address, String phone, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }
}
