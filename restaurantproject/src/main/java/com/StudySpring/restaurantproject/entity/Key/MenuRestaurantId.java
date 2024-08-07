package com.StudySpring.restaurantproject.entity.Key;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MenuRestaurantId implements Serializable {
    private int restaurantId;
    private int categoryId;

    // Constructors, Getters, Setters, equals(), and hashCode() methods

    public MenuRestaurantId() {}

    public MenuRestaurantId(int restaurantId, int categoryId) {
        this.restaurantId = restaurantId;
        this.categoryId = categoryId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuRestaurantId that = (MenuRestaurantId) o;
        return restaurantId == that.restaurantId && categoryId == that.categoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantId, categoryId);
    }
}
