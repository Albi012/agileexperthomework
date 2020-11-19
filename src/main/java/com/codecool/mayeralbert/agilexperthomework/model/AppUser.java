package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppUser {

    public AppUser(String name, Device device) {
        this.name = name;
        this.device = device;
    }

    String name;
    Device device;

}
