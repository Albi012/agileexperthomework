package com.codecool.mayeralbert.agilexperthomework.model;

import com.codecool.mayeralbert.agilexperthomework.AgilexperthomeworkApplication;
import org.springframework.beans.factory.annotation.Autowired;

public class AppAdminUser extends AppUser {

    @Autowired
    AgilexperthomeworkApplication agilexperthomeworkApplication;

    public AppAdminUser(String name, Device device) {
        super(name, device);
    }

    public void addUserToGroup(AppUser appUser){
        agilexperthomeworkApplication.addUser(appUser);
        System.out.println("This user has been added to your group: "+appUser.getName());
    }

}
