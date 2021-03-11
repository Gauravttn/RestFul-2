package com.bootcamp.demo.employee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Employee Details")
public class Employee {
    @NotNull(message = "ID cannot be null")
    @Min(value=0,message = "ID should be greater than zero")
	@ApiModelProperty(notes = "ID should not be null and greater than zero")
    private Integer id;
    
	@ApiModelProperty(notes = "Age should be greater than zero")
    @Min(value=1,message = "Age should be greater than 0")
    private Integer age;
    
	@JsonIgnore
	@ApiModelProperty(notes = "name must contain atleast 2 characters")
    @Size(min = 2,message = "Invalid Name ")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


}
