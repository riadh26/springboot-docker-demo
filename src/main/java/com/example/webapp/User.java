package com.example.webapp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 2, message = "Name must contains 2 letters at least")
    private String name;

    @Size(min = 2, message = "Favorite fruit must contains 2 letters at least")
    private String fruit;
}
