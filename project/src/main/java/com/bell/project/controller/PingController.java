package com.bell.project.controller;

import com.bell.project.model.Doc;
import com.bell.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;

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
//        List<Doc> docsList = jdbcTemplate.query("SELECT * FROM Docs;", new BeanPropertyRowMapper(Doc.class));
        User user = em.find(User.class, 1);
        return user;
    }
}
