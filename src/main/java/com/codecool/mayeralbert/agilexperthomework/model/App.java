package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class App{


    String name;
    @Getter
    @Setter
    String icon;

    public App(String name,String icon) {
        this.name = name;
        this.icon = icon;
    }

    public void runApp(){
        System.out.println("Application is started running:"+this.name);
    }

}
