/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entities;

import java.util.UUID;

public class CartItem {

    private String cartId = "";
    private Product product;
    private int quantity;
    private double totalPrice;

    public CartItem() {
    }

    public CartItem(Product product, int quantity, double totalPrice) {
        String uniqueID = UUID.randomUUID().toString();
        this.cartId = uniqueID;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CartItem{" + "cartId=" + cartId + ", product=" + product + ", quantity=" + quantity + ", totalPrice=" + totalPrice + '}';
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
