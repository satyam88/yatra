package com.example.yatra;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class satyam {
    @GetMapping("/mysatyam")
    public String getData(){
        return "Hello My Name is Satyam Pandey";
    }

}