package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test-rest")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/test-paypal")
    public String testPayPal(){
        return testService.testPayPalCapture();

    }
}
