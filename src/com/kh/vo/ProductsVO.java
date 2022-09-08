package com.kh.vo;

public class ProductsVO {
    private String pdNumber;
    private String pdName;
    private String type;
    private int price;
    private String color;
    private String size;
    private int stock;

    public ProductsVO(String pdNumber, String pdName, String type, int price, String color, String size, int stock) {
        this.pdNumber = pdNumber;
        this.pdName = pdName;
        this.type = type;
        this.price = price;
        this.color = color;
        this.size = size;
        this.stock = stock;
    }

    public String getPdNumber() {
        return pdNumber;
    }

    public void setPdNumber(String pdNumber) {
        this.pdNumber = pdNumber;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
