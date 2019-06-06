package com.bell.project.view.countries;

/**
 * Отображение данных
 */
public class CountriesView {
    private String name;
    private Integer code;

    public CountriesView() {
    }

    public CountriesView(String name, Integer code) {
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
