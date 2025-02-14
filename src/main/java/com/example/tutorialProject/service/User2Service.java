package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User2Service {
    String name = "直江兼続";
    String birthplace = "新潟県";
    String school = "春日山城";

    public void user2(List<String> Users) {
        if (!Objects.equals(name, "")) {
            Users.add(name);
        }
    }

    public void checkUser2(String selectName, List<String> selfIntroduction) {
        if (Objects.equals(name, selectName)) {
            selfIntroduction.add(name);
            selfIntroduction.add(birthplace);
            selfIntroduction.add(school);
        }
    }
}
