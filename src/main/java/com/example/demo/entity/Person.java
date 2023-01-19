package com.example.demo.entity;

import com.example.demo.dto.PersonDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer id;
    @Column(nullable = false)
    private String name;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person() {
    }

    public Person(PersonDTO person){
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
