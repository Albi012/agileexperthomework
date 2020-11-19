package com.codecool.mayeralbert.agilexperthomework.repository;

import com.codecool.mayeralbert.agilexperthomework.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
}
