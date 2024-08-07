package com.StudySpring.restaurantproject.service;

import com.StudySpring.restaurantproject.entity.Roles;
import com.StudySpring.restaurantproject.entity.Users;
import com.StudySpring.restaurantproject.repository.UserInterface;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SignupService {
    @Autowired
    UserInterface userinterface;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public boolean signup(Users users) {
        if(userinterface.findByEmail(users.getEmail()) != null){
            return false;
        }
        Users user = new Users();
        Roles role = new Roles();

        role.setRoleId(1);
        user.setEmail(users.getEmail());
        String encodedPassword = passwordEncoder.encode(users.getPassword());
        user.setPassword(encodedPassword);
        user.setFullName(users.getFullName());
        user.setCreateDate(new Date());
        user.setRoles(role);

        try {
            userinterface.save(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
