package com.StudySpring.restaurantproject.controller;

import com.StudySpring.restaurantproject.entity.Categories;
import com.StudySpring.restaurantproject.payload.ResponseData;
import com.StudySpring.restaurantproject.repository.CategoryInterface;
import com.StudySpring.restaurantproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    CategoryInterface categoryInterface;

    @GetMapping()
    public ResponseEntity<?> getCategory() {
        List<Categories> categories =  categoryService.getAllCategory();
        ResponseData responseData = new ResponseData();
        if(!categories.isEmpty()) {
            responseData.setMessage("success");
            responseData.setData(categories);
        }else{
            responseData.setMessage("empty");
        }
        return new ResponseEntity<>(responseData , HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable int id) {
        Categories categorie = categoryService.getCategoryById(id);
        ResponseData responseData = new ResponseData();
        if(categorie!= null) {
            responseData.setMessage("success");
            responseData.setData(categorie);
        }else{
            responseData.setMessage("empty");
        }
        return new ResponseEntity<>(responseData , HttpStatus.OK);
    }

}
