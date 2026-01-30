package com.anthoen.moneytrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class MoneyTrackVersionController {

    @GetMapping
    public String version(){
        return "Money Track version:1.0.0";
    }

}
