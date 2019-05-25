package com.bell.project.controller.user;

import com.bell.project.filter.user.UserFilter;
import com.bell.project.filter.user.UserInSave;
import com.bell.project.filter.user.UserInUpdate;
import com.bell.project.view.user.UserIdView;
import com.bell.project.view.user.UserListView;
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

    @ApiOperation(value = "Получить список всех сотрудников", httpMethod = "POST")
    @PostMapping(value = "/list")
    public List<UserListView> list(@RequestBody UserFilter userFilter) {
        return list(userFilter);
    }

    @ApiOperation(value = "Получить сотрудника по идентификатору", httpMethod = "GET")
    @GetMapping(value = "/{id}")
    public UserIdView id() {
        return id();
    }

    @ApiOperation(value = "Обновить информацию о сотруднике", httpMethod = "PUT")
    @PutMapping(value = "/update")
    public void update(@RequestBody UserInUpdate userInUpdate) {
    }

    @ApiOperation(value = "Сохраниь информацию о сотруднике", httpMethod = "POST")
    @PostMapping(value = "/save")
    public void save(@RequestBody UserInSave userInSave){
    }
}
