/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderDTO;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author admin
 */
public class OrderDTO implements Serializable  {
    private String email;
    private String orderID;
    private Date time;
    private String phone;
    private String address;
    private String statusOrder;
    private int totalAmount;

    public OrderDTO() {
    }

    public OrderDTO(String email, String orderID, Date time, String phone, String address, String statusOrder, int totalAmount) {
        this.email = email;
        this.orderID = orderID;
        this.time = time;
        this.phone = phone;
        this.address = address;
        this.statusOrder = statusOrder;
        this.totalAmount = totalAmount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
}
