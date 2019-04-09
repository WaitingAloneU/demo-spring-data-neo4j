package com.example.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;


    private String title;
    private String tagline;
    private Integer released;
}
