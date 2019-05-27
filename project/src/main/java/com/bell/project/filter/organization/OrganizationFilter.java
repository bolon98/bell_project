package com.bell.project.filter.organization;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Отображение данных запроса из списка организаций
 */
public class OrganizationFilter {
    @NotBlank(message = "Поле имя должно быть заполнено")
    @Size(min = 2, max = 50, message = "Введеное имя не соответствует ограничению по количеству символов")
    public String name;

    @Size(min = 12, max = 12, message = "Введенный ИНН не соответствует ограничению по количеству символов")
    public String inn;

    public boolean isActive;

    public OrganizationFilter() {
    }

    public OrganizationFilter(String name, String inn, boolean isActive) {
        this.name = name;
        this.inn = inn;
        this.isActive = isActive;
    }
}
