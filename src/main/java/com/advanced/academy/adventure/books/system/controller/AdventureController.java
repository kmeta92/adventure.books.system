package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.model.adventure.Adventure;
import com.advanced.academy.adventure.books.system.model.adventure.Hero;
import com.advanced.academy.adventure.books.system.service.AdventureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/adventure")
public class AdventureController {

    private final AdventureService adventureService;

    @Autowired
    public AdventureController(AdventureService adventureService) {
        this.adventureService = adventureService;
    }


    @PostMapping
    public Adventure createOrUpdate(@RequestBody  Adventure adventure){
          return adventureService.createOrUpdate(adventure);
    }

    @GetMapping
    public List<Adventure> getAll(){
        return adventureService.getAll();
    }
}
