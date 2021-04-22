package com.example.hibernate.controller;

import com.example.hibernate.service.HibernateService;
import com.example.hibernate.table.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HibernateController {

    private final HibernateService hibernateService;

    @Autowired
    public HibernateController(HibernateService hibernateService) {
        this.hibernateService = hibernateService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> byCity(@RequestParam String city) {
        return hibernateService.getPersonByCity(city);
    }

    @GetMapping("/persons/age")
    public List<Person> byAge(@RequestParam int age) {
        return hibernateService.getPersonByAge(age);
    }

    @GetMapping("/persons/name")
    public Optional<Person> byNameSurname(@RequestParam String name, @RequestParam String surname) {
        return hibernateService.getPersonByNameAndSurname(name, surname);
    }
}
