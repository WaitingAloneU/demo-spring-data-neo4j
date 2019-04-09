package com.example.neo4j.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity("ACTED_IN")
public class Role {

    private Long id;
    private List<String> roles = new ArrayList<>();

    @StartNode  // 代表关系的起点
    private Person person;

    @EndNode    //代表关系的终点
    private Movie movie;

    public Role() {
    }

    public Role(Movie movie, Person actor) {
        this.movie = movie;
        this.person = actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
