package com.bell.project.filter.office;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса обновления организаций
 */
public class OfficeInUpdate {
    @NotNull(message = "Поле идентификатора должно быть заполнено")
    @Min(value = 1, message = "Введенный идентификатор не соответствует ограничению по количеству символов")
    public Integer id;

    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @NotBlank(message = "Поле адрес должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введенный адрес не соответствует ограничению по количеству символов")
    public String address;

//    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    public Boolean isActive;

    public OfficeInUpdate() {
    }

    public OfficeInUpdate(Integer id, String name, String address, String phone, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }
}
