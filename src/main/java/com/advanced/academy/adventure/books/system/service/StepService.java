package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.adventure.Step;
import com.advanced.academy.adventure.books.system.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService {
    private final StepRepository stepRepository;

    @Autowired
    public StepService(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }

    public Step createOrUpdate(Step step){
        return stepRepository.save(step);
    }
}
