package com.bell.project.controller;

import com.bell.project.model.*;
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

    @RequestMapping("/user")
    public User ping() {
//        List<DocType> docsList = jdbcTemplate.query("SELECT * FROM Docs;", new BeanPropertyRowMapper(DocType.class));
        User user = em.find(User.class, 1);
        return user;
    }

    @RequestMapping("/usdoc")
    public UserDoc usdoc() {
        UserDoc user_doc = em.find(UserDoc.class, 1);
        return user_doc;
    }

    @RequestMapping("/organiz")
    public Organization organization() {
        Organization org = em.find(Organization.class, 1);
        return org;
    }

    @RequestMapping("/officeId")
    public Office office() {
        Office office = em.find(Office.class, 1);
        return office;
    }

    @RequestMapping("/countries")
    public Countries countries() {
        Countries countries = em.find(Countries.class, 1);
        return countries;
    }

    @RequestMapping("/doctype")
    public DocType doc_type() {
        DocType doc_type = em.find(DocType.class, 1);
        return doc_type;
    }
}
