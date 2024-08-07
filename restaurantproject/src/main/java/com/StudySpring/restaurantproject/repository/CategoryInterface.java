package com.StudySpring.restaurantproject.repository;

import com.StudySpring.restaurantproject.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryInterface extends JpaRepository<Categories, Integer> {
    Categories findByCategoryId(int id);
}
