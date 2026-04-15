package com.lab2.alex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerPrincipal {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}