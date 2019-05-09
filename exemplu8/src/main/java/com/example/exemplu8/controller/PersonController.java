package com.example.exemplu8.controller;

import com.example.exemplu8.entities.Person;
import com.example.exemplu8.repository.PersonRepository;
import com.example.exemplu8.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(path = "/getPeople", method = RequestMethod.GET)
    public List<Person> getPeople() {
        return personService.getPeople();
    }

    @RequestMapping(path = "/getPersonById/{personId}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable int personId) {
        return personService.getPersonById(personId);
    }
}
