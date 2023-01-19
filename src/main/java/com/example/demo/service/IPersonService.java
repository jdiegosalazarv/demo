package com.example.demo.service;

import com.example.demo.dto.PersonDTO;

import java.util.ArrayList;
import java.util.List;

public interface IPersonService {

    void save(PersonDTO person);

    void update(PersonDTO person);

    ArrayList<PersonDTO> getAll();

    void delete();
}
