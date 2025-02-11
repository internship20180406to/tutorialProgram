package com.example.tutorialProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {

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

    public void storeSelectUsers(List<String> users) {
        users.add("選択してください");
        user1Service.user1(users);
        user2Service.user2(users);
        user3Service.user3(users);
        user4Service.user4(users);
        user5Service.user5(users);
        user6Service.user6(users);
    }

    public void checkUsers(String selectName, List<String> selfIntroduction) {
        user1Service.checkUser1(selectName, selfIntroduction);
        user2Service.checkUser2(selectName, selfIntroduction);
        user3Service.checkUser3(selectName, selfIntroduction);
        user4Service.checkUser4(selectName, selfIntroduction);
        user5Service.checkUser5(selectName, selfIntroduction);
        user6Service.checkUser6(selectName, selfIntroduction);
    }
}
