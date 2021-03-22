package com.example.mvc_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {



    @GetMapping("/index")
    public String goToIndexPage(){
        System.out.println("--------------index-----------");
        return "index";

    }
    @GetMapping("/home")
    public String home(){
        System.out.println("###home###");
        return "home";
    }
}
