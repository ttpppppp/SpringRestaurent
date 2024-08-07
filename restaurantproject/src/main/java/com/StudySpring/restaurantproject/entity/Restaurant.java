package com.StudySpring.restaurantproject.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "restaurent")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;

    @Column(name = "restaurantTitle")
    private String restaurantTitle;

    @Column(name = "restaurantDesc")
    private String restaurantDesc;

    @Column(name = "restaurantImage")
    private String restaurantImage;

    @Column(name = "isFreeShip")
    private int isFreeShip;

    @Column(name = "address")
    private String address;

    @Column(name = "openDate")
    private Date openDate;

    @Column(name = "restaurantSubTitle")
    private String restaurantSubTitle;

    @OneToMany(mappedBy = "restaurant")
    private List<Promo> promos;

    @OneToMany(mappedBy = "restaurant")
    private List<Order> orders;

    @OneToMany(mappedBy = "restaurant")
    private List<RateRestaurant> rateRestaurants;

    @OneToMany(mappedBy = "restaurant")
    private List<MenuRestaurant> menuRestaurants;

    @ManyToMany
    @JoinTable(
            name = "menu_restaurant",
            joinColumns = @JoinColumn(name = "restaurantId"),
            inverseJoinColumns = @JoinColumn(name = "categoryId")
    )
    private List<Categories> categories;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantTitle() {
        return restaurantTitle;
    }

    public void setRestaurantTitle(String restaurantTitle) {
        this.restaurantTitle = restaurantTitle;
    }

    public String getRestaurantDesc() {
        return restaurantDesc;
    }

    public void setRestaurantDesc(String restaurantDesc) {
        this.restaurantDesc = restaurantDesc;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(String restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public int getIsFreeShip() {
        return isFreeShip;
    }

    public void setIsFreeShip(int isFreeShip) {
        this.isFreeShip = isFreeShip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getRestaurantSubTitle() {
        return restaurantSubTitle;
    }

    public void setRestaurantSubTitle(String restaurantSubTitle) {
        this.restaurantSubTitle = restaurantSubTitle;
    }

    public List<Promo> getPromos() {
        return promos;
    }

    public void setPromos(List<Promo> promos) {
        this.promos = promos;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<RateRestaurant> getRateRestaurants() {
        return rateRestaurants;
    }

    public void setRateRestaurants(List<RateRestaurant> rateRestaurants) {
        this.rateRestaurants = rateRestaurants;
    }

    public List<MenuRestaurant> getMenuRestaurants() {
        return menuRestaurants;
    }

    public void setMenuRestaurants(List<MenuRestaurant> menuRestaurants) {
        this.menuRestaurants = menuRestaurants;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }
}