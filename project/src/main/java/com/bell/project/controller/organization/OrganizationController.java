package com.bell.project.controller.organization;

import com.bell.project.model.Organization;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "OrganizationController", description = "Управление информацией об организациях")
@RestController
@RequestMapping(value = "/organization", produces = APPLICATION_JSON_VALUE)
public class OrganizationController {

    @Autowired
    public OrganizationController() {
    }

    @ApiOperation(value = "Получить список всех организаций", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<Organization> list() {
        return list();
    }

    @ApiOperation(value = "Получить организации по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public Organization id() {
        return id();
    }

    @ApiOperation(value = "Обновить информацию об организации", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public void update(@RequestBody Organization organization) {
    }

    @ApiOperation(value = "Сохраниь информацию об организации", httpMethod = "POST")
    @PostMapping(value = "/save")
    public Organization save(@RequestBody Organization organization) {
        return organization;
    }
}
