package com.bell.project.filter.organization;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса из добавлении организации
 */
public class OrganizationInSave {
    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @NotBlank(message = "Поле полное имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное полное имя не соответствует ограничению по количеству символов")
    public String full_name;

    @NotBlank(message = "Поле ИНН должно быть заполнено")
    @Size(min = 12, max = 12, message = "Введенный ИНН не соответствует ограничению по количеству символов")
    public String inn;

    @NotBlank(message = "Поле КПП должно быть заполнено")
    @Size(min = 9, max = 9, message = "Введенный КПП не соответствует ограничению по количеству символов")
    public String kpp;

    @NotBlank(message = "Поле адрес должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенный адрес не соответствует ограничению по количеству символов")
    public String address;

    @NotBlank(message = "Поле телефона должно быть заполнено")
    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    @NotBlank(message = "Поле статус активности должно быть заполнено")
    public boolean isActive;

    public OrganizationInSave() {
    }

    public OrganizationInSave(String name, String full_name, String inn, String kpp, String address, String phone, boolean isActive) {
        this.name = name;
        this.full_name = full_name;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }
}
