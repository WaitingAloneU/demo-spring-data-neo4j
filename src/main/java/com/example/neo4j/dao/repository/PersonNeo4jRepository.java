package com.example.neo4j.dao.repository;

import com.example.neo4j.domain.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonNeo4jRepository extends Neo4jRepository<Person, Long> {
    List<Person> findByName(String name);
}
