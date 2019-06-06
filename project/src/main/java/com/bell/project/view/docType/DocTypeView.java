package com.bell.project.view.docType;

/**
 * Отображение данных
 */
public class DocTypeView {
    private String name;
    private Integer code;

    public DocTypeView() {
    }

    public DocTypeView(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
