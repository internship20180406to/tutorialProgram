package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User4Service {
    String name = "";
    public void user4(List<String> Users){
        if(!Objects.equals(name, "")){
            Users.add(name);
        }
    }
}
