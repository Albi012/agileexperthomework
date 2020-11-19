package com.codecool.mayeralbert.agilexperthomework;

import com.codecool.mayeralbert.agilexperthomework.model.AppAdminUser;
import com.codecool.mayeralbert.agilexperthomework.model.AppUser;
import com.codecool.mayeralbert.agilexperthomework.model.Device;
import com.codecool.mayeralbert.agilexperthomework.model.Group;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AgilexperthomeworkApplication {

    private static Group groups;

    public static void main(String[] args) {
        SpringApplication.run(AgilexperthomeworkApplication.class, args);
        groups = Group.builder().user(new AppAdminUser("Dad",new Device())).build();
    }

    public void addUser(AppUser appUser) {
        groups.addUser(appUser);
    }
}
