package com.bell.project.filter.office;

import com.bell.project.model.Organization;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса из списка оффисов
 */
public class OfficeFilter {
    @NotNull(message = "Поле идентификатора должно быть заполнено")
    @Min(value = 1, message = "Введенный идентификатор не соответствует ограничению по количеству символов")
    public Organization orgId;

    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @Size(min = 6, max = 11, message = "Введенный телефон не соответствует ограничению по количеству символов")
    public String phone;

    public Boolean isActive;

    public OfficeFilter() {
    }

    public OfficeFilter(Organization orgId, String name, String phone, Boolean isActive) {
        this.orgId = orgId;
        this.name = name;
        this.phone = phone;
        this.isActive = isActive;
    }
}
