/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review;
import java.util.Scanner;
/**
 *
 * @author oksma
 */
public class BankAccountDriver {
    private Scanner input;
    private BankAccount[] accounts;
    private Customer[] customers;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccountDriver bad = new BankAccountDriver();
        bad.initData();
        bad.run();
    }

    public BankAccountDriver() {
        input = new Scanner(System.in);
    }

    public void initData() {
        customers = new Customer[3];
        customers[0] = new Customer(123, "Nick", "Ferguson", 'J');
        customers[1] = new Customer(456, "Emmanuel", "Amah", 'O');
        customers[2] = new Customer(789, "Clifford", "Brandt", 'L');
        
        accounts = new BankAccount[3];
        accounts[0] = new ChequingAccount(1, 500, 111, 1100.50f, customers[0]);
        accounts[1] = new ChequingAccount(2, 500, 222, 1100.50f, customers[1]);
        accounts[2] = new ChequingAccount(3, 500, 333, 1100.50f, customers[2]);
        
    }

    public int showActionMenu() {
        int option = 0;
        System.out.println("1. deposit ");
        System.out.println("2. withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. quit ");
        option = input.nextInt();
        return option;

    }

    public void executeAction(int action, BankAccount ba) {

        if (action == 1) {
            System.out.println("Deposit amount:");
            float amount = input.nextFloat();
            ba.deposit(amount);
            System.out.println("End Balance: " + ba.getBalance());
        } else if (action == 2) {
            System.out.println("Withdraw Amount");
            float amount = input.nextFloat();
            ba.withdraw(amount);
        } else if (action == 3) {
            System.out.println("Enter target account no: ");
            int acctId = input.nextInt();
            BankAccount targetBa = getBankAccountByAccountNumber(acctId);

            System.out.println("How much to transfer");
            float amount = input.nextFloat();
            ba.transfer(targetBa, amount);

        } else if (action == 4) {
            System.out.println("exiting....");
        } else {
            System.out.println("Invalid Action, TRY AGAIN!!!");
        }
    }

    public BankAccount getBankAccountByAccountNumber(int accountId) {
        BankAccount b = null;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber() == accountId) {
                b = accounts[i];

            }

        }
        return b;
    }

    public Customer getCustomerById(int id) {
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCustomerId() == id) {
                c = customers[i];
            }
        }
        return c;
    }

    public void displayAccountsForCustomer(Customer c) {
        int numFound = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCustomer().getCustomerId() == c.getCustomerId()) {
                System.out.println("Account Number: " + accounts[i].getAccountNumber());
                numFound++;
            }
        }
        if (numFound == 0) {
            System.out.println("no accounts ");
        }
    }

    public void run() {
        System.out.println("Enter customer id: ");
        int custId = input.nextInt();
        Customer c = getCustomerById(custId);
        System.out.println("Customer: " + c.fullname());
        int action = -1;
        while (action != 4) {
            displayAccountsForCustomer(c);
            System.out.println("Select a account");
            int acctId = input.nextInt();
            BankAccount b = getBankAccountByAccountNumber(acctId);
            action = showActionMenu();
            executeAction(action, b);
        }
    }
}
    

