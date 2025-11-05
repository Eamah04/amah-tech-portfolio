/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedLists;

/**
 *
 * @author oksma
 */
public class GLinkedLists<T> {

    private GListNode<T> items;
    private GListNode<T> current;

    public void add(T item) {
        if (items == null) {
            items = new GListNode(item);
            current = items;
        } else {
            current.next = new GListNode(item);
            current = current.next;
        }
    }

    public void print() {
        GListNode<T> temp = items;

        while (temp != null) {
            System.out.println("data: " + temp.getData());
            temp = temp.next;
        }
    }

}
