package com.bell.project.filter.office;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса из добавлении оффиса
 */
public class OfficeInSave {
    @NotBlank(message = "Поле идентификатора должно быть заполнено")
    @Min(value = 1, message = "Введенный идентификатор не соответствует ограничению по количеству символов")
    public int org_id;

    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @NotBlank(message = "Поле адрес должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенный адрес не соответствует ограничению по количеству символов")
    public String address;

    @NotBlank(message = "Поле телефона должно быть заполнено")
    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    @NotBlank(message = "Поле статус активности должно быть заполнено")
    public boolean is_active;

    public OfficeInSave() {
    }

    public OfficeInSave(int org_id, String name, String address, String phone, boolean is_active) {
        this.org_id = org_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.is_active = is_active;
    }
}
