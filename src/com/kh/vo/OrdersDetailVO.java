package com.kh.vo;

public class OrdersDetailVO {
    private int ordersNumber;
    private String productsNumber;
    private int pcs;
    private String ordersDate;

    public OrdersDetailVO(int ordersNumber, String productsNumber, int pcs, String ordersDate) {
        this.ordersNumber = ordersNumber;
        this.productsNumber = productsNumber;
        this.pcs = pcs;
        this.ordersDate = ordersDate;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    public String getProductsNumber() {
        return productsNumber;
    }

    public void setProductsNumber(String productsNumber) {
        this.productsNumber = productsNumber;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(String ordersDate) {
        this.ordersDate = ordersDate;
    }
}
