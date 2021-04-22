package com.example.hibernate.repository;


import com.example.hibernate.table.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class HibernateRepository {

    @Autowired
    private JpaRepository jpaRepository;

    public List<Person> getPersonByCity(String city) {
        return jpaRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(int age) {
        return jpaRepository.findByAgeLessThan(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return jpaRepository.findByNameAndSurname(name, surname);
    }
}
