package com.codecool.mayeralbert.agilexperthomework.model;

import java.util.ArrayList;
import java.util.List;

public class Device {

    public Device() {
        this.applications = new ArrayList<>();
        this.backgrounds = List.of("Default","Background1","Background2");
        this.theme = "default";
    }

    List<App> applications;
    //Backgrounds for devices
    List<String> backgrounds;
    String currentBackground;
    //Arculatváltás
    String theme;


    public void installApplication(App app){
        applications.add(app);
    }

    public void addBackground(String background){
        backgrounds.add(background);
        System.out.println("Background has been added!");
    }

    public void setBackground(String background){
        if(backgrounds.contains(background)){
            currentBackground = background;
        }
    }

    public void changeTheme(String theme){
        this.theme = theme;
    }
}
