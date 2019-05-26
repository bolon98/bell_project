package com.bell.project.service.organization;

import com.bell.project.filter.organization.OrganizationFilter;
import com.bell.project.filter.organization.OrganizationInSave;
import com.bell.project.filter.organization.OrganizationInUpdate;
import com.bell.project.view.organization.OrganizationIdView;
import com.bell.project.view.organization.OrganizationListView;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * Сервис
 */
@Validated
public interface OrganizationService {
    /**
     * Получить список организаций
     *
     */
    List<OrganizationListView> list(@Valid OrganizationFilter orgFilter);

    /**
     * Получить организацию по идентификатору
     *
     */
    OrganizationIdView id(Integer id);

    /**
     * Обновить организацию
     *
     */
    void update(@Valid OrganizationInUpdate orgInUpdate);

    /**
     * Добавить новую организацию в БД
     *
     */
    void add(@Valid OrganizationInSave orgInSave);
}
