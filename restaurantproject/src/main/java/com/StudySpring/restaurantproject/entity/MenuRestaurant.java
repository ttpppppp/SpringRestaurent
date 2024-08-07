package com.StudySpring.restaurantproject.entity;

import com.StudySpring.restaurantproject.entity.Key.MenuRestaurantId;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "menu_restaurant")
public class MenuRestaurant {
    @EmbeddedId
    private MenuRestaurantId id;

    @ManyToOne
    @MapsId("restaurantId")
    @JoinColumn(name = "restaurantId")
    private Restaurant restaurant;

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "categoryId")
    private Categories categories;

    @Column(name = "createdate")
    private Date createDate;

    // Getters and Setters

    public MenuRestaurantId getId() {
        return id;
    }

    public void setId(MenuRestaurantId id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
