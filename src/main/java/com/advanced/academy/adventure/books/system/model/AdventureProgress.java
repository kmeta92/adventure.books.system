package com.advanced.academy.adventure.books.system.model;

import com.advanced.academy.adventure.books.system.model.adventure.Adventure;
import com.advanced.academy.adventure.books.system.model.adventure.Choice;
import com.advanced.academy.adventure.books.system.model.adventure.Hero;
import com.advanced.academy.adventure.books.system.model.adventure.Step;

import javax.persistence.*;

@Entity
@Table(name = "adventure_progresses")
public class AdventureProgress {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;

    @ManyToOne
    @JoinColumn(name = "adventure_id")
    private Adventure adventure;

    @ManyToOne
    @JoinColumn(name = "current_step_id")
    private Step currentStep;

    public Integer getId() {
        return id;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Adventure getAdventure() {
        return adventure;
    }

    public void setAdventure(Adventure adventure) {
        this.adventure = adventure;
    }

    public Step getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Step currentStep) {
        this.currentStep = currentStep;
    }
}
