package com.StudySpring.restaurantproject.service;

import com.StudySpring.restaurantproject.dto.UserDTO;
import com.StudySpring.restaurantproject.entity.Users;
import com.StudySpring.restaurantproject.repository.TestManager;
import com.StudySpring.restaurantproject.repository.UserInterface;
import com.StudySpring.restaurantproject.service.Imp.LoginUserImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements LoginUserImp {
    @Autowired
    UserInterface userinterface;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    TestManager testmanager;

    public List<UserDTO> getAllUser() {
        List<Users> users = testmanager.getAllUserManagers();
        List<UserDTO> userdto = new ArrayList<UserDTO>();
        for (Users user : users) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(user.getUserId());
            userDTO.setEmail(user.getEmail());
            userDTO.setFullName(user.getFullName());
            userdto.add(userDTO);
        }
        return userdto;
    }
    public String checkLogin(String email, String password) {
        try {
            Users user = userinterface.findByEmail(email);
            System.out.println(user.getUserId());
            if (user != null && passwordEncoder.matches(password, user.getPassword())) {
                return user.getFullName();
            }
        } catch (Exception e) {
            System.err.println("An error occurred during login check: " + e.getMessage());
        }
        return null;
    }
}
