package com.bell.project.service.organization;

import com.bell.project.view.organization.OrganizationListView;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * Сервис
 */
@Validated
public interface OrganizationService {
    /**
     * Получить список организаций
     *
     * @return
     */
    List<OrganizationListView> list();


}
