package com.example.neo4j.service;

import com.example.neo4j.domain.Person;

import java.util.List;

public interface PersonService {

    public List<Person> getPersons(String name);

    public Person addPerson(Person person);
}
