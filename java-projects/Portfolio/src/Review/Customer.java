/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review;

/**
 *
 * @author oksma
 */
public class Customer extends Person {
     private int customerId;

  

    public Customer(int customerId, String firstName, String lastName, char middleInit) {
        super(firstName, lastName, middleInit);
        this.customerId = customerId;
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
    
}
    
