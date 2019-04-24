package com.bell.project.controller;

import com.bell.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

/**
 * Контроллер, проверяющий соединение
 */
@RestController
public class PingController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    EntityManager em;

    @RequestMapping("/ping")
    public User ping() {
//        List<Doc_type> docsList = jdbcTemplate.query("SELECT * FROM Docs;", new BeanPropertyRowMapper(Doc_type.class));
        User user = em.find(User.class, 1);
        return user;
    }
}
