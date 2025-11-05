/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review;

/**
 *
 * @author oksma
 */
public class Person {
     private String firstName;
     private String lastName;
     private char middleInit;
     
      public Person(String firstName, String lastName, char middleInit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInit = middleInit;
    }
      public Person()
      {
      
      }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getMiddleInit() {
        return middleInit;
    }

    public void setMiddleInit(char middleInit) {
        this.middleInit = middleInit;
    }

   public String fullname()
   {
   return firstName + " "+ lastName + " "+ middleInit+".";
   }

    
}
