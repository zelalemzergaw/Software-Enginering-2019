package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping(value={"/elibrary","elibrary/home"})
    public String homePage(){
        return "home/index";
    }
}
