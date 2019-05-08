package com.bell.project.controller.organization;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "OrganizationController", description = "Управлением информацией об организациях")
@RestController
@RequestMapping(value = "/organization")
public class OrganizationController {

    @Autowired
    public OrganizationController() {
    }

    @ApiOperation(value = "Получить список всех организаций", httpMethod = "POST")
    @PostMapping(value = "/list")
    public void list() {
    }

    @ApiOperation(value = "Получить организации по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public void id() {
    }

    @ApiOperation(value = "Обновить информацию об организации", httpMethod = "POST")
    @PostMapping(value = "/update")
    public void update() {
    }

    @ApiOperation(value = "Сохраниь информациб об организации", httpMethod = "POST")
    @PostMapping(value = "/save")
    public void save() {
    }
}