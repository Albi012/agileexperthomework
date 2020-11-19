package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Group {

    public Group(AppAdminUser appAdminUser){
        this.users = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    Long id;
    @ManyToMany
    @Singular
    List<AppUser> users;

    public void addUser(AppUser appUser) {
        users.add(appUser);
    }
}
