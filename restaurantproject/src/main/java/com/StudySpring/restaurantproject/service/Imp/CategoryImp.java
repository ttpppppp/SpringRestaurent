package com.StudySpring.restaurantproject.service.Imp;

import com.StudySpring.restaurantproject.entity.Categories;

import java.util.List;

public interface CategoryImp {
    List<Categories> getAllCategory();
    Categories getCategoryById(int id);
}
