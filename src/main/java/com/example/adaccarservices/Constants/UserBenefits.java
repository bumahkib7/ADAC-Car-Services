package com.example.adaccarservices.Constants;

public enum UserBenefits {
    BASIC("Basic", "Basic benefits", 100,1 , 0),
    SILVER ("Silver", "Up to 100km", 250, 5, 25),
    GOLDEN_PREMIUM("Golden Premium", "Up to 500km", 500, 10, 50);

    private String name;
    private String description;
    private int price;
    private int duration;
    private int discount;

    private UserBenefits(String name, String description, int price, int duration, int discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.discount = discount;
    }

    UserBenefits() {

    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public int getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name;
    }


}
