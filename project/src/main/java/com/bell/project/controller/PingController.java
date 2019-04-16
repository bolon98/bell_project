package com.bell.project.controller;

import com.bell.project.model.Docs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер, проверяющий соединение
 */
@RestController
public class PingController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/ping")
    public List<Docs> ping() {
        List<Docs> docsList = jdbcTemplate.query("SELECT * FROM Docs;", new BeanPropertyRowMapper(Docs.class));
        return docsList;
    }
}
