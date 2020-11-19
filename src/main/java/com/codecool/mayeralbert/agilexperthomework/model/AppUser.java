package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class AppUser {

    public AppUser(String name, Device device) {
        this.name = name;
        this.device = device;
    }

    public AppUser(){}

    @Id
    @GeneratedValue
    Long id;
    String name;
    @OneToOne
    Device device;

}
