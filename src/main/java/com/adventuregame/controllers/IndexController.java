package com.adventuregame.controllers;

import com.adventuregame.repositories.BaseCharacterRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

    private final BaseCharacterRepo baseCharacterRepo;

    public IndexController(BaseCharacterRepo baseCharacterRepo) {
        this.baseCharacterRepo = baseCharacterRepo;
    }

    @GetMapping("/game")
    public String IndexController(Model model) {

        model.addAttribute("baseCharacterList", baseCharacterRepo.findAll());
        return "index";
    }



}
