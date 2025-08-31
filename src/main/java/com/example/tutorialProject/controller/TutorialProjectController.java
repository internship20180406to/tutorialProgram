package com.example.tutorialProject.controller;

import com.example.tutorialProject.service.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

@Controller
public class TutorialProjectController {
    @Autowired
    private TutorialService tutorialService;
    @GetMapping("/tutorial")
    public String getTutorial(Model model) {
        List<String> users = new ArrayList<>();

        tutorialService.storeSelectUsers(users);

        model.addAttribute("place", "福岡県福岡市中央区");
        model.addAttribute("Date", LocalDateTime.now());
        model.addAttribute("users", users);

        return "tutorialMina";
    }

    @PostMapping("/tutorial")
    @Validated
    public String postTutorial(@RequestParam("Name") @NotBlank String name,
                               Model model) {
        System.out.println("選択された名前: " + name);
        List<String> selfIntroduction = new ArrayList<>();

        tutorialService.checkUsers(name,selfIntroduction);

        model.addAttribute("name", selfIntroduction.getFirst());
        model.addAttribute("birthplace", selfIntroduction.get(1));
        model.addAttribute("school", selfIntroduction.getLast());

        return "tutorialCss";
    }
}
