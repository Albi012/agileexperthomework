package com.codecool.mayeralbert.agilexperthomework.service;

import com.codecool.mayeralbert.agilexperthomework.model.App;
import com.codecool.mayeralbert.agilexperthomework.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppDataManager {

    @Autowired
    AppRepository appRepository;

    public void runApplication(App app){
        System.out.println("This app has started running: "+app.getName());
    }

}
