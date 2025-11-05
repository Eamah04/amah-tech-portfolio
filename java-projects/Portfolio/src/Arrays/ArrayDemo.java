/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;
import  Exceptions.*;
/**
 *
 * @author oksma
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        ArrayManager am = new ArrayManager(5);
        try{
            am.remove(0);
        am.add(12);
        am.add(34);
        am.add(54);
        am.add(13);
        am.add(9);
        am.add(99);
        am.print();
        System.out.println("--------");
        am.printItems();
        System.out.println("-------");
        am.insertAt(66, 2);
        am.print();
        System.out.println("-------");
        am.remove(2);
        am.print();
        am.insertAt(20, -1);
        }
        catch (NoItemsException nie )
        {
            System.out.println(nie.getMessage());
        
        }
        
        catch (OutOfBoundsException oobe )
        {
            System.out.println(oobe.getMessage());
        
        }
//        // create new array and fill
//        int[] items = new int[5];
////int[] items = {12,34, 54, 13, 9};
//        items[0] = 12;
//        items[1] = 34;
//        items[2] = 54;
//        items[3] = 13;
//        items[4] = 9;
//
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i]);
//        }//1 make a bigger array
//        int[] temp = new int[items.length + 1];
//        //2 copy everything from the original to the new array
//        System.arraycopy(items, 0, temp, 0, items.length);
//        //3 point old array to new array
//        items = temp;
//
//        //4 add the new item
//        items[5] = 99;
//        System.out.println("-----------");
//        // print array 
//        for (int i = 0; i < items.length; i++) {
//
//            System.out.println(items[i]);
//        }
    }

}