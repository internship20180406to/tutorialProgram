package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User4Service {
    String name = "aki";
    String birthplace = "h";
    String school = "fit";

    public void user4(List<String> Users) {
        if (!Objects.equals(name, "")) {
            Users.add(name);
        }
    }

    public void checkUser4(String selectName, List<String> selfIntroduction) {
        if (Objects.equals(name, selectName)) {
            selfIntroduction.add(name);
            selfIntroduction.add(birthplace);
            selfIntroduction.add(school);
        }
    }
}
