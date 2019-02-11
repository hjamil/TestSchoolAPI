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

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
