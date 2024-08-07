package com.StudySpring.restaurantproject.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;

    @Column(name = "foodName")
    private String foodName;

    @Column(name = "foodImage")
    private String foodImage;

    @Column(name = "timeShip")
    private String timeShip;

    @Column(name = "isFreeShip")
    private int isFreeShip;

    @Column(name = "foodPrice")
    private int foodPrice;

    @Column(name = "foodQuantity")
    private int foodQuantity;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories categories;

    @OneToMany(mappedBy = "food")
    private List<OrderDetails> orderDetails;

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getTimeShip() {
        return timeShip;
    }

    public void setTimeShip(String timeShip) {
        this.timeShip = timeShip;
    }

    public int getIsFreeShip() {
        return isFreeShip;
    }

    public void setIsFreeShip(int isFreeShip) {
        this.isFreeShip = isFreeShip;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
