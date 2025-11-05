package LinkedLists;
//import java.util.LinkedList;

import Exceptions.OutOfBoundsException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author oksma
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add("dog");
        list.add(8);
        list.add(9);
        list.add("cat");
        GLinkedLists<Integer> l =new GLinkedLists<Integer>();
        l.add(5);
      

        list.print();
        list.start();
        list.end();
        list.add("f");
        System.out.println("-------");
        list.print();
    }
}
//        System.out.println(list.getCurrent());
//    }
//}
//// 
//        try {
//                list.advance();
//            } catch (OutOfBoundsException oobe) {
//                
//            
//                System.out.println("(ERROR: " + oobe.getMessage());
//            }
//        list.addAfter("Im an Invader");
//        System.out.println(list.getCurrent());
//        list.print();
//        
//    
//        }
//}
//    

/*     ListNode a = new ListNode("Im in A");
        ListNode b = new ListNode("Im in B");
        ListNode c = new ListNode("Im in C");
        ListNode d = new ListNode("Im in D");
        ListNode e = new ListNode("Im in E");
        ListNode f = new ListNode("Im in F");
        ListNode g = new ListNode("Im an Intruder");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        f.next = f;

        ListNode temp = a;
        while (temp != null) {
            System.out.println("Dates: " + temp.getData());
            temp = temp.next;
        }
        c.next=g;
        g.next=d;
        
        System.out.println("--------");
        temp=a;
        
        while (temp != null) {
            System.out.println("Dates: " + temp.getData());
            temp = temp.next;
    }

}
} */
