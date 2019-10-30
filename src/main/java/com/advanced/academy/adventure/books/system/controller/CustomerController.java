package com.advanced.academy.adventure.books.system.controller;


import com.advanced.academy.adventure.books.system.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @PostMapping(value = "/add")
    public String addCustomer(@RequestBody Customer customer){
        return "Hello!";
    }
}
