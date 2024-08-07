package com.StudySpring.restaurantproject.repository;

import com.StudySpring.restaurantproject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
    Users findByFullName(String fullName);
}
