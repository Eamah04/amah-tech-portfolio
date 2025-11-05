/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparisons;

/**
 *
 * @author oksma
 */
public class Widget implements Comparable<Widget> {

    private int id;
    private String name;
    private int size;

    public Widget(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;              // same reference
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Widget w = (Widget) o;
        return id == w.id;                       // equality by id
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);             // consistent with equals
    }

    @Override
    public int compareTo(Widget other) {
        return Integer.compare(this.size, other.size); // compare by size
    }

    @Override
    public String toString() {
        return id + " " + name + " " + size;
    }
}
