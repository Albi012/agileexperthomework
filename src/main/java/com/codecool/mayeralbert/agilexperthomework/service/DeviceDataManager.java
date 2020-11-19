package com.codecool.mayeralbert.agilexperthomework.service;

import com.codecool.mayeralbert.agilexperthomework.model.App;
import com.codecool.mayeralbert.agilexperthomework.model.Device;
import com.codecool.mayeralbert.agilexperthomework.repository.DeviceRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceDataManager {

    @Autowired
    DeviceRepository deviceRepository;

    public void installApplication(Device device, App app) {
        device.getApplications().add(app);
        deviceRepository.saveAndFlush(device);
    }

    public void addBackground(Device device, String background) {
        device.getBackgrounds().add(background);
        deviceRepository.saveAndFlush(device);
        System.out.println("Background has been added!");
    }

    public void setBackground(Device device,String background) {
        if (device.getBackgrounds().contains(background)) {
            device.setCurrentBackground(background);
            deviceRepository.saveAndFlush(device);
        }
    }

    public void changeTheme(Device device,String theme) {
        device.setTheme(theme);
        deviceRepository.saveAndFlush(device);
    }

}
