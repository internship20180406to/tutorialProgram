package com.example.tutorialProject.controller;

import com.example.tutorialProject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

@Controller
public class TutorialProjectController {

    @Autowired
    private User1Service user1Service;
    @Autowired
    private User2Service user2Service;
    @Autowired
    private User3Service user3Service;
    @Autowired
    private User4Service user4Service;
    @Autowired
    private User5Service user5Service;
    @Autowired
    private User6Service user6Service;

    @GetMapping("/tutorial")
    public String getTutorial(Model model) {
        List<String> users = new ArrayList<>();
        users.add("選択してください");
        user1Service.user1(users);
        user2Service.user2(users);
        user3Service.user3(users);
        user4Service.user4(users);
        user5Service.user5(users);
        user6Service.user6(users);
        model.addAttribute("place", "福岡県福岡市中央区");
        model.addAttribute("Date", LocalDateTime.now());
        model.addAttribute("users", users);
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
