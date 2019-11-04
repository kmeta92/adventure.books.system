package com.advanced.academy.adventure.books.system.model;

import javax.persistence.*;

@Entity
@Table(name = "choice")
public class Choice {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "step_given_in_id")
    private Step stepGivenIn;

    @ManyToOne
    @JoinColumn(name = "results_in_step_id")
    private Step resultInStep;


    @Column(name = "reputationChange")
    private Integer reputationChange;

    public void setId(Integer id) {
        this.id = id;
    }

    public Step getStepGivenIn() {
        return stepGivenIn;
    }

    public void setStepGivenIn(Step stepGivenIn) {
        this.stepGivenIn = stepGivenIn;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Step getResultInStep() {
        return resultInStep;
    }

    public void setResultInStep(Step resultInStep) {
        this.resultInStep = resultInStep;
    }
}
