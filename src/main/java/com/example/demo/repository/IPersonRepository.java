package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Integer> {
}
