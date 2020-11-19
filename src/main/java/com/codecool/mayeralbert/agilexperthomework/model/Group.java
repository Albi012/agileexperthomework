package com.codecool.mayeralbert.agilexperthomework.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Group {

    public Group(List<AppUser> users) {
        this.users = users;
    }

    @Singular
    List<AppUser> users;

    public void addUser(AppUser appUser) {
        users.add(appUser);
    }
}
