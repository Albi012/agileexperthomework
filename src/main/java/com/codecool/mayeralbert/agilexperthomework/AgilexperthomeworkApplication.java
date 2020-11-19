package com.codecool.mayeralbert.agilexperthomework;

import com.codecool.mayeralbert.agilexperthomework.model.AppAdminUser;
import com.codecool.mayeralbert.agilexperthomework.model.AppUser;
import com.codecool.mayeralbert.agilexperthomework.model.Device;
import com.codecool.mayeralbert.agilexperthomework.model.Group;
import com.codecool.mayeralbert.agilexperthomework.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AgilexperthomeworkApplication {

    @Autowired
    private AppRepository appRepository;

    private static Group group;

    public static void main(String[] args) {
        SpringApplication.run(AgilexperthomeworkApplication.class, args);
        group = new Group(new AppAdminUser("Dad", new Device()));
    }

    public void addUser(AppUser appUser) {
        group.addUser(appUser);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {


        };
    }


}
