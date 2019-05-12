package com.bell.project.controller.user;

import com.bell.project.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "UserController", description = "Управление информацией о сотрудниках")
@RestController
@RequestMapping(value = "/user", produces = APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    public UserController() {
    }

    @ApiOperation(value = "Получить список всех сотрудников", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<User> list() {
        return list();
    }

    @ApiOperation(value = "Получить сотрудника по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public User id() {
        return id();
    }

    @ApiOperation(value = "Обновить информацию о сотруднике", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public void update(@RequestBody User user) {
    }

    @ApiOperation(value = "Сохраниь информацию о сотруднике", httpMethod = "POST")
    @PostMapping(value = "/save")
    public User save(@RequestBody User user) {
        return user;
    }
}
