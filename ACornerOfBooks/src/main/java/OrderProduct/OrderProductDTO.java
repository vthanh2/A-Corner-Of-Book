/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderProduct;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class OrderProductDTO implements Serializable{
    private String orderID;
    private String ISBN;
    private int quantity;

    public OrderProductDTO() {
    }

    public OrderProductDTO(String orderID, String ISBN, int quantity) {
        this.orderID = orderID;
        this.ISBN = ISBN;
        this.quantity = quantity;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
