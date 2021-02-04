package com.adventuregame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

    @GetMapping("/game")
    public String IndexController() {
        return "index";
    }



}
