package com.advanced.academy.adventure.books.system.model;

import com.advanced.academy.adventure.books.system.model.enums.UserType;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Integer id;
    private UserType type;
    private String email;
    private String username;
    private List<Hero> heroList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Hero> getAdventureList() {
        return heroList;
    }

    public void setAdventureList(List<Hero> adventureList) {
        this.heroList = adventureList;
    }
}
