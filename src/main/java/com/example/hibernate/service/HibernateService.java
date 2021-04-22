package com.example.hibernate.service;

import com.example.hibernate.table.Person;
import com.example.hibernate.repository.HibernateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HibernateService {

    private final HibernateRepository hibernateRepository;

    @Autowired
    public HibernateService(HibernateRepository hibernateRepository) {
        this.hibernateRepository = hibernateRepository;
    }

    public List<Person> getPersonByCity(String city) {
        return hibernateRepository.getPersonByCity(city);
    }

    public List<Person> getPersonByAge(int age) {
        return hibernateRepository.getPersonByAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return hibernateRepository.getPersonByNameAndSurname(name, surname);
    }
}