package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.model.Tag;
import com.advanced.academy.adventure.books.system.model.adventure.Hero;
import com.advanced.academy.adventure.books.system.service.CustomerService;
import com.advanced.academy.adventure.books.system.service.HeroService;
import com.advanced.academy.adventure.books.system.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tag")
public class TagController {

    private final TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }


    @PostMapping
    public void  getTagList(@RequestBody Tag tag){
        tagService.createOrUpdate(tag);
    }

    @GetMapping
    public List<Tag> getAll(){
        return tagService.getAllTags();
    }


    @GetMapping("/adventures/{adventureId}")
    public List<Tag> getTagsByAdventureId(@PathVariable("adventureId") Integer adventureId){
    return tagService.getTagsByAdventureId(adventureId);
    }

    @GetMapping(value = "/{tagId}")
    public Tag getTags(@PathVariable("tagId")Integer tagId){

        return tagService.getTagById(tagId);
    }

}