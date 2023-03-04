package com.thehecklers.acdbfm;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class AcdbfmController {
    private final PersonRepository repo;

    public AcdbfmController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    Iterable<Person> getAllPersons() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    Optional<Person> getPersonById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/oneperson")
    Person getFirstPerson() {
        return repo.findAll().iterator().next();
    }

    @PostMapping("/newperson")
    Person addPerson(@RequestBody Person Person) {
        return repo.save(Person);
    }
}
