package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class App {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String icon;

    public App(){}

    public App(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

}
