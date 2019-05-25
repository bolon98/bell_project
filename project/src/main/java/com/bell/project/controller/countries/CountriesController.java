package com.bell.project.controller.countries;

import com.bell.project.view.countries.CountriesView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "CountriesController", description = "Управление информацией о странах")
@RestController
@RequestMapping(value = "/countries", produces = APPLICATION_JSON_VALUE)
public class CountriesController {

    @ApiOperation(value = "Получить список всех стран", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<CountriesView> list() {
        return list();
    }
}
