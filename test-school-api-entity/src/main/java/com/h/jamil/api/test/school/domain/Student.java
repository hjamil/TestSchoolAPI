package com.h.jamil.api.test.school.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Student", description = "Data model for Student")
@JsonPropertyOrder({"id", "name"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    private Integer id;

    private String name;

    private String something;

    public Student() {
    }

    @JsonProperty(value = "id", required = true)
    @ApiModelProperty(position = 0, required = true, dataType = "Integer", example = "1", notes = "Student ID.")
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty(value = "name", required = true)
    @ApiModelProperty(position = 1, required = true, dataType = "String", example = "Student 1", notes = "Student Name.")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty(value = "something", required = false)
    @ApiModelProperty(position = 2, required = false, dataType = "String", example = "abcd", notes = "Something coming from the config.")
    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public Student(Integer id, String name, String something) {
        this.id = id;
        this.name = name;
        this.something = something;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", something='" + something + '\'' +
                '}';
    }
}
