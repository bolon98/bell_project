package com.bell.project.controller.office;

import com.bell.project.filter.office.OfficeFilter;
import com.bell.project.filter.office.OfficeInSave;
import com.bell.project.filter.office.OfficeInUpdate;
import com.bell.project.service.office.OfficeService;
import com.bell.project.view.office.OfficeIdView;
import com.bell.project.view.office.OfficeListView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "OfficeController", description = "Управление информацией об оффисах")
@RestController
@RequestMapping(value = "/api/office", produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    private final OfficeService officeService;

    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @ApiOperation(value = "Получить список всех оффисов", httpMethod = "POST")
    @PostMapping(value = "/list")
    public List<OfficeListView> list(@RequestBody OfficeFilter officeFilter) {
        return officeService.list(officeFilter);
    }

    @ApiOperation(value = "Получить оффис по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public OfficeIdView id(@PathVariable(value = "id") Integer id) {
        return officeService.id(id);
    }

    @ApiOperation(value = "Обновить информацию об оффисе", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public String update(@RequestBody OfficeInUpdate officeInUpdate) {
        officeService.update(officeInUpdate);
        return "Success";
    }

    @ApiOperation(value = "Сохраниь информацию об оффисе", httpMethod = "POST")
    @PostMapping(value = "/save")
    public String save(@RequestBody OfficeInSave officeInSave) {
        officeService.add(officeInSave);
        return "Success";
    }
}
