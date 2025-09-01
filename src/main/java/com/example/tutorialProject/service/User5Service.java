package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User5Service {
    String name = "game";
    String birthplace = "hospital";
    String school = "tsukushinbo";

    public void user5(List<String> Users) {
        if (!Objects.equals(name, "")) {
            Users.add(name);
        }
    }

    public void checkUser5(String selectName, List<String> selfIntroduction) {
        if (Objects.equals(name, selectName)) {
            selfIntroduction.add(name);
            selfIntroduction.add(birthplace);
            selfIntroduction.add(school);
        }
    }
}
