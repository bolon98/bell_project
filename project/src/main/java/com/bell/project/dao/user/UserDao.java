package com.bell.project.dao.user;

import com.bell.project.model.User;

import java.util.List;

/**
 * DAO для работы с User
 */
public interface UserDao {

    /**
     * Получить все объекты User
     *
     * @return
     */
    List<User> all();

    /**
     * Получить User по идентификатору
     *
     * @param id
     * @return
     */
    User loadById(Integer id);

    /**
     * Обновить User
     *
     * @param
     * @return
     */
    void update(User user);

    /**
     * Сохранить User
     *
     * @param user
     */
    void save(User user);
}
