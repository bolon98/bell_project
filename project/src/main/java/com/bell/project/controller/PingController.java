package com.bell.project.controller;

import com.bell.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.print.Doc;
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

    @RequestMapping("/user")
    public User ping() {
//        List<Doc_type> docsList = jdbcTemplate.query("SELECT * FROM Docs;", new BeanPropertyRowMapper(Doc_type.class));
        User user = em.find(User.class, 1);
        return user;
    }

    @RequestMapping("/usdoc")
    public User_doc usdoc() {
        User_doc user_doc = em.find(User_doc.class, 1);
        return user_doc;
    }

    @RequestMapping("/organization")
    public Organization organization() {
        Organization org = em.find(Organization.class, 1);
        return org;
    }

    @RequestMapping("/office")
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
    public Doc_type doc_type() {
        Doc_type doc_type = em.find(Doc_type.class, 1);
        return doc_type;
    }
}
