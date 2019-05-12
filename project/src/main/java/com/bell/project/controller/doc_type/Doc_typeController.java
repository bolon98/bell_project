package com.bell.project.controller.doc_type;

import com.bell.project.model.Doc_type;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "Doc_typeController", description = "Управление информацией о типах документов")
@RestController
@RequestMapping(value = "/doc_type", produces = APPLICATION_JSON_VALUE)
public class Doc_typeController {

    @ApiOperation(value = "Получить список всех типов документов", httpMethod = "GET")
    @GetMapping(value = "/list")
    public List<Doc_type> list() {
        return list();
    }
}
