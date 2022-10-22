package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;

public class visaservice {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please book your hhhh Flight ticket, Choose Your Fav Airlines Idigo";
    }
}
