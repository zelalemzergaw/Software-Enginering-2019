package edu.mum.cs.cs425.demowebapp.elibrary.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value={"/","","/elibrary/home"})
    public  String displayHomePage(){
        return "home/index";
    }

}
