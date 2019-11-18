package com.advanced.academy.adventure.books.system.model;

import com.advanced.academy.adventure.books.system.model.adventure.Adventure;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags")

public class Tag {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "value", unique = true)
    private String value;

    @ManyToMany(mappedBy = "tags")
    private Set<Adventure> adventure = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Set<Adventure> getAdventure() {
        return adventure;
    }

    public void setAdventure(Set<Adventure> adventure) {
        this.adventure = adventure;
    }
}
