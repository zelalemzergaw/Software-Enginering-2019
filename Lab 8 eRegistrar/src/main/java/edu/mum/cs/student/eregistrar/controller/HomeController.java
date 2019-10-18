package edu.mum.cs.student.eregistrar.controller;

import edu.mum.cs.student.eregistrar.model.Student;
import edu.mum.cs.student.eregistrar.service.StudentService;
import org.hibernate.boot.model.source.internal.hbm.ResultSetMappingBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
 @RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"","/"})
    public String homePage(){

        return "home-page";
    }

}

