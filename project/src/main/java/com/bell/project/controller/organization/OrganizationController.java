package com.bell.project.controller.organization;

import com.bell.project.filter.organization.OrganizationFilter;
import com.bell.project.filter.organization.OrganizationInSave;
import com.bell.project.filter.organization.OrganizationInUpdate;
import com.bell.project.service.organization.OrganizationService;
import com.bell.project.view.organization.OrganizationIdView;
import com.bell.project.view.organization.OrganizationListView;
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

    private final OrganizationService orgService;

    @Autowired
    public OrganizationController(OrganizationService orgService) {
        this.orgService = orgService;
    }

    @ApiOperation(value = "Получить список всех организаций", httpMethod = "POST")
    @PostMapping(value = "/list")
    public List<OrganizationListView> list(@RequestBody OrganizationFilter organizationFilter) {
        return orgService.list(organizationFilter);
    }

    @ApiOperation(value = "Получить организации по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public OrganizationIdView id(@PathVariable(value = "id") Integer id) {
        return orgService.id(id);
    }

    @ApiOperation(value = "Обновить информацию об организации", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public String update(@RequestBody OrganizationInUpdate organizationInUpdate) {
        orgService.update(organizationInUpdate);
        return "Success";
    }

    @ApiOperation(value = "Сохраниь информацию об организации", httpMethod = "POST")
    @PostMapping(value = "/save")
    public String save(@RequestBody OrganizationInSave organizationInSave) {
        orgService.add(organizationInSave);
        return "Success";
    }
}
