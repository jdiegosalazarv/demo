package com.example.demo.dto;

import com.example.demo.entity.Person;

public class PersonDTO {

    private Integer id;
    private String name;


    public PersonDTO(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public PersonDTO() {
    }

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
