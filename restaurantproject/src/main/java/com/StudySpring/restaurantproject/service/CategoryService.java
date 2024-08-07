package com.StudySpring.restaurantproject.service;

import com.StudySpring.restaurantproject.entity.Categories;
import com.StudySpring.restaurantproject.repository.CategoryInterface;
import com.StudySpring.restaurantproject.service.Imp.CategoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryImp {
    @Autowired
    CategoryInterface categoryInterface;

    @Override
    public List<Categories> getAllCategory() {
       return categoryInterface.findAll();
    }

    @Override
    public Categories getCategoryById(int id) {
        Categories categorie = categoryInterface.findByCategoryId(id);
        return categorie;
    }
}
