package com.edu.springexercise.exercisefromyoutube.exercisefromyoutube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping(value = {"/","/home"})
    public String Helloworld(){
        return "home";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
