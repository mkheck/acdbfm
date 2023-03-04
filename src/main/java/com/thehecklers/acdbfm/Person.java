package com.thehecklers.acdbfm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Person(@Id String id,
                     String firstName,
                     String lastName,
                     String address) {
    public Person(String firstName, String lastName, String address) {
        this(null, firstName, lastName, address);
    }
}
