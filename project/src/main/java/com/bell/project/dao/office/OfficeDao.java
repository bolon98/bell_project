package com.bell.project.dao.office;

import com.bell.project.model.Office;
import com.bell.project.model.Organization;

import java.util.List;

/**
 * DAO для работы с Office
 */
public interface OfficeDao {
    /**
     * Получить все объекты Office
     *
     * @return
     */
    List<Office> all(Organization orgId, String name, String phone, Boolean isActive);

    /**
     * Получить Office по идентификатору
     *
     * @param id
     * @return
     */
    Office loadById(Integer id);

    /**
     * Обновить Office
     *
     * @param
     * @return
     */
    void update(Office office);

    /**
     * Сохранить Office
     *
     * @param
     */
    void save(Office office);
}
