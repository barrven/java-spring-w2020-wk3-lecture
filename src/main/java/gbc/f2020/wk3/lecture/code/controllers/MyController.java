package gbc.f2020.wk3.lecture.code.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }

}
