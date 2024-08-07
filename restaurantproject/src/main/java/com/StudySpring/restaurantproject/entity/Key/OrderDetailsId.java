package com.StudySpring.restaurantproject.entity.Key;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailsId implements Serializable {
    private int orderId;
    private int foodId;

    // Constructors, Getters, Setters, equals(), and hashCode() methods

    public OrderDetailsId() {}

    public OrderDetailsId(int orderId, int foodId) {
        this.orderId = orderId;
        this.foodId = foodId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailsId that = (OrderDetailsId) o;
        return orderId == that.orderId && foodId == that.foodId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, foodId);
    }
}
