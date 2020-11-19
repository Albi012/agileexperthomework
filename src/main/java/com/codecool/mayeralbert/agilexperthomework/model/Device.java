package com.codecool.mayeralbert.agilexperthomework.model;

import java.util.ArrayList;
import java.util.List;

public class Device {

    public Device() {
        this.applications = new ArrayList<>();
    }

    List<App> applications;

    public void installApplication(App app){
        applications.add(app);
    }
}
