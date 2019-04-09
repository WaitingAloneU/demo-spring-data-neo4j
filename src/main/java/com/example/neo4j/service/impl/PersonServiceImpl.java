package com.example.neo4j.service.impl;

import com.example.neo4j.dao.repository.PersonNeo4jRepository;
import com.example.neo4j.domain.Person;
import com.example.neo4j.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonNeo4jRepository repository;

    public Person addPerson(Person person){
        return repository.save(person);
    }

    public List<Person> getPersons(String name){
        return repository.findByName(name);
    }
}
