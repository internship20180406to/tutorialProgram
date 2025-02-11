package com.example.tutorialProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class TutorialProjectController {
    @GetMapping("/tutorial")
    public String getTutorial(Model model) {
        model.addAttribute("place", "福岡県福岡市中央区");
        model.addAttribute("Date", LocalDateTime.now());
        return "tutorialMina";
    }

    @PostMapping("/tutorial")
    public String postTutorial(@RequestParam("place") String place,
                               @RequestParam("Name") String name,
                               Model model) {
        System.out.println(name);
        model.addAttribute("birthplace", place);
        return "tutorialCss";
    }
}
