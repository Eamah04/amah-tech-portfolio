/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author oksma
 */
public class Tree {

    private TreeNode root;
    public int searchCount = 0;

    public void addNode(TreeNode current, Object o) {
        Comparable c = (Comparable) o;

        if (root == null) {
            root = new TreeNode(o);
        } else if (c.compareTo(current.getData()) < 0) {
            if (current.left == null) {
                current.left = new TreeNode(o);
            } else {
                addNode(current.left, o);
            }
        } else if (c.compareTo(current.getData()) > 0) {
            if (current.right == null) {
                current.right = new TreeNode(o);
            } else {
                addNode(current.right, o);
            }
        }
        // If equal, do nothing (no duplicates allowed)
    }

    public void addNode(Object o) {
        addNode(root, o);
    }

    public void printTree(TreeNode current) {
        if (current == null) {
            return;
        }

        printTree(current.left);
        System.out.println(current.getData());
        printTree(current.right);
    }

    public void printTree() {
        printTree(root);
    }

    public Object searchTree(TreeNode current, Object o) {
        searchCount++;
        if (current == null) {
            return null;
        }

        Comparable c = (Comparable) o;
        searchCount++;

        if (c.compareTo(current.getData()) == 0) {
            return current.getData();
        } else if (c.compareTo(current.getData()) < 0) {
            return searchTree(current.left, o);
        } else {
            return searchTree(current.right, o);
        }
    }

    public Object searchTree(Object o) {
        return searchTree(root, o);
    }
}
