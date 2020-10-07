package gbc.f2020.wk3.lecture.code.controllers;

import gbc.f2020.wk3.lecture.code.services.GreetingService;
import org.springframework.stereotype.Controller;


public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
