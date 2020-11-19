package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Data;

@Data
public class AppUser {

    public AppUser(String name, Device device) {
        this.name = name;
        this.device = device;
    }

    String name;
    Device device;

}
