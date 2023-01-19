package com.example.demo.service;

import com.example.demo.dto.PersonDTO;
import com.example.demo.entity.Person;
import com.example.demo.repository.IPersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService implements IPersonService{

    private final IPersonRepository iPersonRepository;

    public PersonService(IPersonRepository iPersonRepository) {
        this.iPersonRepository = iPersonRepository;
    }

    @Override
    public void save(PersonDTO person) {
        this.iPersonRepository.save(new Person(person));
    }

    @Override
    public void update(PersonDTO person) {
        if(this.iPersonRepository.existsById(person.getId())){
            this.iPersonRepository.save(new Person(person));
        }
    }

    @Override
    public ArrayList<PersonDTO> getAll() {
        List<Person> list = (List<Person>) this.iPersonRepository.findAll();
        return (ArrayList<PersonDTO>) list.stream().map(PersonDTO::new).collect(Collectors.toList());
    }

    @Override
    public void delete() {

    }
}
