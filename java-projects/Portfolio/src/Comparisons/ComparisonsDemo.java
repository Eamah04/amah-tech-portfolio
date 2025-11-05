/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Comparisons;

import Review.Person;
import Arrays.ArrayManager;

/**
 *
 * @author oksma
 */
public class ComparisonsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Widget[] widgets = new Widget[4];
        widgets[0] = new Widget(1, "Thingy", 66);
        widgets[1] = new Widget(2, "Dohickey", 99);
        widgets[2] = new Widget(3, "Thingamajig", 773);
        widgets[3] = new Widget(4, "Stuff", 6);

        ArrayManager am = new ArrayManager(widgets);
        am.print();

        int largestIndex = am.findLargest();
        System.out.println("Largest widget at index: " + largestIndex);
        System.out.println("Largest widget: " + widgets[largestIndex]);

        Widget item = new Widget(2, "Dohickey", 22);
        int foundIndex = am.find(item);
        System.out.println("Found item at index: " + foundIndex);
    }
}
