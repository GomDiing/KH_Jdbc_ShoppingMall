package com.kh.vo;

public class OrdersVO {
    private int orderNumber;
    private int csNumber;
    private int totalCost;
    private int shipping;
    private String status;
    private int discount;

    public OrdersVO(int orderNumber, int csNumber, int totalCost, int shipping, String status, int discount) {
        this.orderNumber = orderNumber;
        this.csNumber = csNumber;
        this.totalCost = totalCost;
        this.shipping = shipping;
        this.status = status;
        this.discount = discount;
    }

    public int getoNO() {
        return orderNumber;
    }

    public void setoNO(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCsNumber() {
        return csNumber;
    }

    public void setCsNumber(int csNumber) {
        this.csNumber = csNumber;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        shipping = shipping;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
