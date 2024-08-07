package com.StudySpring.restaurantproject.entity;


import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "createdate")
    private Date createDate;

    @ManyToMany(mappedBy = "categories")
    private List<Restaurant> restaurants;

    @OneToMany(mappedBy = "categories")
    private List<Food> foods;

    @OneToMany(mappedBy = "categories")
    private List<MenuRestaurant> menuRestaurants;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<MenuRestaurant> getMenuRestaurants() {
        return menuRestaurants;
    }

    public void setMenuRestaurants(List<MenuRestaurant> menuRestaurants) {
        this.menuRestaurants = menuRestaurants;
    }

    // Getters and Setters
}
