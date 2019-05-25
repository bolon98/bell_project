package com.bell.project.controller.office;

import com.bell.project.filter.office.OfficeFilter;
import com.bell.project.filter.office.OfficeInSave;
import com.bell.project.filter.office.OfficeInUpdate;
import com.bell.project.model.Office;
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
@RequestMapping(value = "/officeId", produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    @Autowired
    public OfficeController() {
    }

    @ApiOperation(value = "Получить список всех оффисов", httpMethod = "POST")
    @PostMapping(value = "/list")
    public List<OfficeListView> list(@RequestBody OfficeFilter officeFilter) {
        return list(officeFilter);
    }

    @ApiOperation(value = "Получить оффис по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public OfficeIdView id() {
        return id();
    }

    @ApiOperation(value = "Обновить информацию об оффисе", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public void update(@RequestBody OfficeInUpdate officeInUpdate) {
    }

    @ApiOperation(value = "Сохраниь информацию об оффисе", httpMethod = "POST")
    @PostMapping(value = "/save")
    public void save(@RequestBody OfficeInSave officeInSave) {
    }
}
