package com.StudySpring.restaurantproject.security;

import com.StudySpring.restaurantproject.entity.Users;
import com.StudySpring.restaurantproject.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserInterface userinterface;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userinterface.findByFullName(username);
        if(users == null){
            throw new UsernameNotFoundException(username);
        }
        return new User(username , users.getPassword() ,new ArrayList<>());
    }
}
