package com.example.studentapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @PostMapping("/register")
    @ResponseBody
    public String register(
            @RequestParam String name,
            @RequestParam String roll,
            @RequestParam String email,
            @RequestParam String course) {

        return "Registration Successful! Welcome " + name;
    }
}
