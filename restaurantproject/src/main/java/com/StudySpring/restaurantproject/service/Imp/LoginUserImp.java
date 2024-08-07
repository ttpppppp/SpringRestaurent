package com.StudySpring.restaurantproject.service.Imp;

import com.StudySpring.restaurantproject.dto.UserDTO;

import java.util.List;

public interface LoginUserImp {
     List<UserDTO> getAllUser();
     String checkLogin(String email , String password);
}
