package com.h.jamil.api.test.school.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Course", description = "Data model for Course")
@JsonPropertyOrder({"id", "name"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {

    private Integer id;

    private String name;

    public Course() {
    }

    @JsonProperty(value = "id", required = true)
    @ApiModelProperty(position = 0, required = true, dataType = "Integer", example = "1", notes = "Course ID.")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty(value = "name", required = true)
    @ApiModelProperty(position = 1, required = true, dataType = "String", example = "Course 1", notes = "Course Name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
