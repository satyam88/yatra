package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;

public class holiday {
    @GetMapping("/myholiday")
    public String getData(){
        return "Please book your hhhh holiday ticket, Choose Your Fav Airlines Idigo";
    }
}
