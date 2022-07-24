package com.wzj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wzj")
public class wzjController {

    @GetMapping
    public String save(){
        System.out.println("wzj");
        return "ok";

    }

}
