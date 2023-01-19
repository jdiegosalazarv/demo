package com.example.demo.controller;

import com.example.demo.dto.PersonDTO;
import com.example.demo.service.IPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final IPersonService iPersonService;

    public PersonController(IPersonService iPersonService) {
        this.iPersonService = iPersonService;
    }

    @GetMapping()
    public ResponseEntity<?> getPersonAll(){
        return ResponseEntity.ok().body(this.iPersonService.getAll());
    }

    @PostMapping()
    public ResponseEntity<?> savePerson(@RequestBody PersonDTO person){
        this.iPersonService.save(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
