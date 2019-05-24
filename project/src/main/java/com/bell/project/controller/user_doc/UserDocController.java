package com.bell.project.controller.user_doc;

import com.bell.project.model.UserDoc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "UserDocController", description = "Управление информацией о документах сотрудников")
@RestController
@RequestMapping(value = "/userDoc", produces = APPLICATION_JSON_VALUE)
public class UserDocController {

    @ApiOperation(value = "Получить список всех ", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<UserDoc> list() {
        return list();
    }
}
