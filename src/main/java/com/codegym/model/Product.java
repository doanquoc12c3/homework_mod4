package com.codegym.model;

public class Product {
    int id;
    String name;
    Double price;
    String description;
    String imgURL;


    public Product(int id, String name, Double price, String description, String imgURL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgURL = imgURL;
    }


    public Product(String name, Double price, String description, String imgURL) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgURL = imgURL;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
