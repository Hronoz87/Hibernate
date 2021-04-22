package com.example.hibernate.repository;

import com.example.hibernate.table.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface JpaRepository extends CrudRepository<Person, Long> {

        List<Person> findByCityOfLiving(String cityOfLiving);

        List<Person> findByAgeLessThan(int age);

        Optional<Person> findByNameAndSurname(String name, String surname);
}
