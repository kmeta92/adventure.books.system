package com.advanced.academy.adventure.books.system.model.adventure;

import com.advanced.academy.adventure.books.system.model.Tag;
import com.advanced.academy.adventure.books.system.model.adventure.Step;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "adventures")
public class Adventure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Step getFirstStep() {
        return firstStep;
    }

    public void setFirstStep(Step firstStep) {
        this.firstStep = firstStep;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "first_step_id")
    private Step firstStep;

    @Column(name = "story")
    private String story;


    @Column(name = "number_of_lives")
    private Integer numberOfLives;

    @Column(name = "starting_reputation")
    private Integer startingReputation;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "adventures_tags",
            joinColumns = { @JoinColumn(name = "adventure_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") }
    )
    Set<Tag> tags = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(Integer numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public Integer getStartingReputation() {
        return startingReputation;
    }

    public void setStartingReputation(Integer startingReputation) {
        this.startingReputation = startingReputation;
    }
}
