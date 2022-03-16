/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entities;

public class Stock {
    private int stockId;
    private int productId;
    private int quantity;

    public Stock() {
    }

    public Stock(int stockId, int productId, int quantity) {
        this.stockId = stockId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockId=" + stockId + ", productId=" + productId + ", quantity=" + quantity + '}';
    }
    
    
}
