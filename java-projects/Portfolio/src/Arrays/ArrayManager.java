/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import Exceptions.*;

/**
 *
 * @author oksma
 */
public class ArrayManager {

    private Object[] items;
    private int count;

    public ArrayManager() {
        items = new Object[10];
        count = 0; 
    }

    public ArrayManager(int size) {
        items = new Object[size];
        count = 0;
    }

    public ArrayManager(Object[] items) {
        this.items = items;
        count = items.length;
    }

    public void add(Object o) {
        if (count >= items.length) {
            resize();
        }
        items[count++] = o;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void printItems() {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private void resize() {
        Object[] temp = new Object[items.length + 10];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
    }

    public void insertAt(Object o, int pos) throws OutOfBoundsException {
        if (pos < 0 || pos > count) {
            throw new OutOfBoundsException("Invalid position");
        }
        if (count >= items.length) {
            resize();
        }
        System.arraycopy(items, pos, items, pos + 1, count - pos);
        items[pos] = o;
        count++;
    }

    public void remove(int pos) throws NoItemsException, OutOfBoundsException {
        if (count == 0) {
            throw new NoItemsException("Remove failed. No items.");
        }
        if (pos < 0 || pos >= count) {
            throw new OutOfBoundsException("Invalid position");
        }
        System.arraycopy(items, pos + 1, items, pos, count - pos - 1);
        items[--count] = null; // clear last slot
    }

    public Object getItemAt(int pos) throws OutOfBoundsException {
        if (pos < 0 || pos >= count) {
            throw new OutOfBoundsException("Invalid position");
        }
        return items[pos];
    }
    
    public Object addAt(int pos) throws OutOfBoundsException{
        if (pos <0 || pos >=count){
            throw new OutOfBoundsException("Position Beyond Limit");
            
        }
        return items[pos];
    }

    public int findLargest() {
        if (count == 0) {
            return -1;
        }
        int pos = 0;
        for (int i = 1; i < count; i++) {
            Comparable c = (Comparable) items[i];
            if (c.compareTo(items[pos]) > 0) {
                pos = i;
            }
        }
        return pos;
    }

    public int find(Object o) {
        for (int i = 0; i < count; i++) {
            if (items[i] != null && items[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
}
