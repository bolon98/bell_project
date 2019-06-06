package com.bell.project.service.office;

import com.bell.project.filter.office.OfficeFilter;
import com.bell.project.filter.office.OfficeInSave;
import com.bell.project.filter.office.OfficeInUpdate;
import com.bell.project.view.office.OfficeIdView;
import com.bell.project.view.office.OfficeListView;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Validated
public interface OfficeService {
    /**
     * Получить список оффисов
     *
     */
    List<OfficeListView> list(@Valid OfficeFilter officeFilter);

    /**
     * Получить оффис по идентификатору
     *
     */
    OfficeIdView id(Integer id);

    /**
     * Обновить оффис
     *
     */
    void update(@Valid OfficeInUpdate officeInUpdate);

    /**
     * Добавить новый оффис в БД
     *
     */
    void add(@Valid OfficeInSave officeInSave);
}
