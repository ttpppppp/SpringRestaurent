package com.StudySpring.restaurantproject.entity;

import com.StudySpring.restaurantproject.entity.Key.OrderDetailsId;
import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {
    @EmbeddedId
    private OrderDetailsId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "foodId")
    private Food food;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private int price;

    public OrderDetailsId getId() {
        return id;
    }

    public void setId(OrderDetailsId id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
