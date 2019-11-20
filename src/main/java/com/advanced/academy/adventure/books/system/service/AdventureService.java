package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.adventure.Adventure;
import com.advanced.academy.adventure.books.system.model.adventure.Choice;
import com.advanced.academy.adventure.books.system.repository.AdventureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdventureService {

    private final AdventureRepository adventureRepository;

    @Autowired
    public AdventureService(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }


    public Adventure createOrUpdate(Adventure adventure){

        Adventure result = adventureRepository.save(adventure);

            result.getFirstStep().setChoiceList(null);
        return result;
    }

    public List<Adventure> getAll(){
        List<Adventure> adventures = new ArrayList<>();
        Iterable<Adventure> result = adventureRepository.findAll();
        if(null != result) {
            result.forEach(adventure -> adventures.add(adventure));
        }

        return adventures;
    }
}
