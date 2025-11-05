package LinkedLists;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Exceptions.*;

/**
 *
 * @author oksma
 */
public class LinkedList {

    private ListNode start;
    private ListNode current;
    private int count;

    public LinkedList() {
    }

    public ListNode getCurrent() {
        return current;
    }

    public void setCurrent(ListNode current) {
        this.current = current;
    }

    public void add(Object item) {
        // end();
        ListNode temp = new ListNode(item);
        if (start == null) {
            start = temp;
            current = temp;
        } else {
            current.next = temp;
            current = current.next;
        }
        count++;
    }

    public void print() {
        ListNode temp = start;
        while (temp != null) {
            System.out.println("Data: " + temp.getData());
            temp = temp.next;
        }
    }

    public int size() {
        return count;

    }

    public void start() {
        current = start;
    }

    public void advance() throws OutOfBoundsException {
        if (current.next == null) {
            throw new OutOfBoundsException();
        }
        current = current.next;
    }

    public void end() {
        current = start;
        while (current.next != null) {
            try {
                advance();
            } catch (OutOfBoundsException oobe) {
                System.out.println("(ERROR: " + oobe.getMessage());
            }

        }
    }

    public void addAfter(Object item) {
        //Assignment, complete the following:
        //add after current
        //1. creat the listnode for the item
        //2. handle empty list edge case
        //3. add new node after current
        ListNode temp = new ListNode(item);
        if (start == null) {
            start = temp;
            current = temp;
        } else {
            temp.next = current.next;
            current.next = temp;
            current = temp;
        }
        count++;
    }
    
    

    public void removeCurrent() throws NoItemsException {
        //Edge cases
        if (start == null) {
            throw new NoItemsException();
        } else if (current == start) {
            start = start.next;
        } else {

            //1. declare a temp node
            ListNode temp = start;
            //2. advance it till its next is current
            while (temp.next != current) {
                temp = temp.next;
            }
            //3. point it to what comes after current
            temp.next = temp.next.next;
            //4. point current to temp
            current = temp;

        }
        
        count--;

    }
    public void addBefore(Object item){
        ListNode node =new ListNode(item);
            if(start==null)
            {
        start = node;
        current=start;
            }
            else if(current==start)
            {
                node.next = current;
                start = node;
                current = node;
            }
            else{
                ListNode temp =start;
                while(temp.next!=current)
                {
                    temp=temp.next;
                }
                node.next = current;
                temp.next=node;
                current=node;
    }
            count++;
    
        //add before current
        //1. edge cases
        //2. Get a reference to the node before current
        //3. use it to insert the new node before current
    }
    public Object getItemAt(int pos) throws OutOfBoundsException
    {
        if(pos<0 || pos>count)
                {
                    throw new OutOfBoundsException("Cannot Retrieve outside of Bounds");
                }
        ListNode temp = start;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
        }
        return temp.getData();
    }
}
