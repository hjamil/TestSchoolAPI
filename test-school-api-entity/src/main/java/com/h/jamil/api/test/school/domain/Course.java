package com.h.jamil.api.test.school.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Course", description = "Data model for Course")
@JsonPropertyOrder({"id", "name", "something"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {

    private Integer id;

    private String name;

    private String something;

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

    @JsonProperty(value = "something", required = true)
    @ApiModelProperty(position = 2, required = true, dataType = "String", example = "abcd", notes = "Something coming from the config.")
    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public Course(Integer id, String name, String something) {
        this.id = id;
        this.name = name;
        this.something = something;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", something='" + something + '\'' +
                '}';
    }
}
