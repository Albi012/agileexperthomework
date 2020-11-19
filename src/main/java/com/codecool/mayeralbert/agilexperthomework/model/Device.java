package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Device {


    public Device() {
        this.applications = new ArrayList<>();
        this.backgrounds = List.of("Default", "Background1", "Background2");
        this.theme = "default";
    }

    @Id
    @GeneratedValue
    Long id;
    @ManyToMany
    List<App> applications;
    //Backgrounds for devices
    @ElementCollection
    List<String> backgrounds;
    String currentBackground;
    //Arculatváltás
    String theme;

}
