package com.khair.springbootmongodb.service;

import com.khair.springbootmongodb.collection.Person;
import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String personId);

    List<Person> getPersonByAge(Integer minAge, Integer maxAge);

    Page<Person> searchPerson(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

    List<Document> getOldestPersonByCity();

    List<Document> getPopulationByCity();
}
