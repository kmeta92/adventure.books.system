package com.advanced.academy.adventure.books.system.model.adventure;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.model.adventure.Adventure;

import javax.persistence.*;

@Entity
@Table(name = "heroes")

public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nick_name")
    private String nickname;
    @Column(name = "reputation")
    private Integer reputation;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "adventure_id")
    private Adventure adventure;
    @Column(name = "number_of_lives")
    private Integer numberOfLives;

    public Adventure getAdventure() {
        return adventure;
    }

    public void setAdventure(Adventure adventure) {
        this.adventure = adventure;
    }

    public Integer getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(Integer numberOfLives) {
        this.numberOfLives = numberOfLives;
    }


    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

}
