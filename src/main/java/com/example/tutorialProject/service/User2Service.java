package com.example.tutorialProject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class User2Service {
    String name = "";
    public void user2(List<String> Users){
        if(!Objects.equals(name, "")){
            Users.add(name);
        }
    }
}
