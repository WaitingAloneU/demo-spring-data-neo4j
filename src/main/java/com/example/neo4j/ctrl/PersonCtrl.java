package com.example.neo4j.ctrl;

import com.example.neo4j.domain.Person;
import com.example.neo4j.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonCtrl {

    @Resource
    private PersonService personService;

    @GetMapping("")
    public @ResponseBody List<Person> persons(String name){
        return personService.getPersons(name);
    }
}
