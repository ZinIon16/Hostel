/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

/**
 *
 * @author adrianasyakirah
 */
public class Customer {
    
    private String customerId;
    private String customerName;
    private String req;
    
    public Customer() {
        super();
    }
    
    public Customer(String customerId, String customerName, String req) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.req = req;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getReq() {
        return req;
    }
    
    public void setReq(String req) {
        this.req = req;
    }
}
