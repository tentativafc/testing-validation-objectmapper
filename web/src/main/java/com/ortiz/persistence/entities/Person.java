package com.ortiz.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @EmbeddedId
    private PersonId personId;
    private String type;
    private String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Phone> phones;
}
