/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entities;

import java.sql.Date;

public class Bill {
    private int orderId;
    private String name;
    private Date orderDate;
    private double listPrice;
    private boolean orderStatus;

    public Bill() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Bill{" + "orderId=" + orderId + ", name=" + name + ", orderDate=" + orderDate + ", listPrice=" + listPrice + ", orderStatus=" + orderStatus + '}';
    }

    public Bill(int orderId, String name, Date orderDate, double listPrice, boolean orderStatus) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.listPrice = listPrice;
        this.orderStatus = orderStatus;
    }
    
    
    
}
