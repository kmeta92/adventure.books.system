package com.advanced.academy.adventure.books.system.model.adventure;

import com.advanced.academy.adventure.books.system.model.adventure.Choice;
import com.advanced.academy.adventure.books.system.model.enums.EndGameType;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "steps")
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "end_game_type")
    @Enumerated(EnumType.STRING)
    private EndGameType endGameType = EndGameType.NONE;

    @Column(name = "ends_game")
    private boolean endGame = false;

    @Column(name = "story", columnDefinition = "TEXT")
    private String story;

    @OneToMany(mappedBy = "stepGivenIn", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<Choice> choicelist = new ArrayList<>();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }



    public EndGameType getEndGameType() {
        return endGameType;
    }

    public void setEndGameType(EndGameType endGameType) {
        this.endGameType = endGameType;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Choice> getChoiceList() {
        return choicelist;
    }

    public void setChoiceList(List<Choice> choicelist) {
        this.choicelist = choicelist;
    }

}
