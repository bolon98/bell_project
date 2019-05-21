package com.bell.project.controller.office;

import com.bell.project.model.Office;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "OfficeController", description = "Управление информацией об оффисах")
@RestController
@RequestMapping(value = "/office", produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    @Autowired
    public OfficeController() {
    }

    @ApiOperation(value = "Получить список всех оффисов", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<Office> list() {
        return list();
    }

    @ApiOperation(value = "Получить оффис по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public Office id() {
        return id();
    }

    @ApiOperation(value = "Обновить информацию об оффисе", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public void update(@RequestBody Office office) {
    }

    @ApiOperation(value = "Сохраниь информацию об оффисе", httpMethod = "POST")
    @PostMapping(value = "/save")
    public Office save(@RequestBody Office office) {
        return office;
    }
}
