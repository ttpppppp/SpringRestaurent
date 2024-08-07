package com.StudySpring.restaurantproject.controller;

import com.StudySpring.restaurantproject.entity.Users;
import com.StudySpring.restaurantproject.payload.ResponseData;
import com.StudySpring.restaurantproject.repository.TestManager;
import com.StudySpring.restaurantproject.repository.UserInterface;
import com.StudySpring.restaurantproject.service.LoginService;
import com.StudySpring.restaurantproject.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserInterface userinterface;
    @Autowired
    LoginService loginservice;
    @Autowired
    SignupService signupservice;

    @Autowired
    TestManager testmanager;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> getAllUser() {
        return new ResponseEntity<>(loginservice.getAllUser(),HttpStatus.OK);
    }
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String email, @RequestParam String password) {
        String data = loginservice.checkLogin(email,password);
        ResponseData responseData = new ResponseData();
        if (data != null) {
            responseData.setMessage("sucess");;
            responseData.setData(data);
            return new ResponseEntity<>( responseData, HttpStatus.OK);
        }
        responseData.setMessage("fail");
        return new ResponseEntity<>(responseData , HttpStatus.OK);
    }
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Users user) {
           boolean isSucess = signupservice.signup(user);
           ResponseData responseData = new ResponseData();
           if(isSucess){
               responseData.setMessage("sucess");
               return new ResponseEntity<>(responseData,HttpStatus.OK);
           }
           responseData.setMessage("fail");
           return new ResponseEntity<>(responseData , HttpStatus.OK);
    }
}
