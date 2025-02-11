package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User3Service {
    String name = "";
    String birthplace = "";
    String school = "";

    public void user3(List<String> Users) {
        if (!Objects.equals(name, "")) {
            Users.add(name);
        }
    }

    public void checkUser3(String selectName, List<String> selfIntroduction) {
        if (Objects.equals(name, selectName)) {
            selfIntroduction.add(name);
            selfIntroduction.add(birthplace);
            selfIntroduction.add(school);
        }
    }
}
