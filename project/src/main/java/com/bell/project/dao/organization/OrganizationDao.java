package com.bell.project.dao.organization;

import com.bell.project.model.Organization;
import java.util.List;

/**
 * DAO для работы с Organization
 */
public interface OrganizationDao {

    /**
     * Получить все объекты Organization
     *
     * @return
     */
    List<Organization> all(String name, String inn, Boolean isActive);

    /**
     * Получить Organization по идентификатору
     *
     * @param id
     * @return
     */
    Organization loadById(Integer id);

    /**
     * Обновить Organization
     *
     * @param
     * @return
     */
    void update(Organization organization);

    /**
     * Сохранить Organization
     *
     * @param organization
     */
    void save(Organization organization);
}
