package com.example.neo4j.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
public class Person {
    @Id
    @Index
    @GeneratedValue
    private Long id;
    private String name;
    private Integer born;

    @Relationship(type = "ACTED_IN")
    private List<Movie> movies = new ArrayList<>();

    @Labels
    private List<String> labels = new ArrayList<>();
}
