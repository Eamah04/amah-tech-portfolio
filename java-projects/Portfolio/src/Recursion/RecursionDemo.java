/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author oksma
 */
public class RecursionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("sum: " + sumAll(5));
        System.out.println("factorial:" + factorial(5));
        System.out.println("Power:" + myPow(2, 3));
        System.out.println("Palindrome:" + isPalindrome("racecar"));
        indentoTron(5);
    }
    // this will sum all number from 1 to n

    public static int sumAll(int n) {
        if (n == 1) {
            return n;// this is a base case

        } else {
            return n + sumAll(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;// this is a base case
        } else {
            return n * factorial(n - 1);
        }

    }

    public static int myPow(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;//base case
        } else {
            return a * (myPow(a, b - 1));
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        } else if (start > end) {
            return true;
        } else {
            return (isPalindrome(s, start + 1, end - 1));
        }
    }

    //This is a helper method
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    //Helper method
    public static void indentoTron(int n) {
        indentoTron(n, 1);
    }

    public static void indentoTron(int n, int i) {
        if (i > n) {
            return;
        } else {
            printSpaces(i);
            System.out.println("This was written by call number " + i);
            indentoTron(n, i + 1);
            printSpaces(i);
            System.out.println("This was ALSO written by call number " + i);
        }

    }

    public static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        } else {
            System.out.print(" ");
            printSpaces(spaces - 1);
        }

    }
}
