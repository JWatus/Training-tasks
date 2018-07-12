package com.company.implementations.binartree_implementation;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    public static void main(String[] args) {
        new BinaryTree().run();
    }

    static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    List<String> lista = new LinkedList<>();

    private void run() {
        // build the simple tree from chapter 11.
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, 1);
        insert(root, 8);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
        System.out.println("Traversing tree in order");
        printInOrder(root);
        System.out.println("Check if tree contains node");
        System.out.println(contains(root, 9));
        System.out.println(contains(root, 26));
    }

    private void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of "
                        + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    private boolean contains(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if (value < current.value) {
            return contains(current.left, value);
        } else {
            return contains(current.right, value);
        }
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("  Traversed " + node.value);
            printInOrder(node.right);
        }
    }

    /**
     * Function to calculate the minimum depth of the tree
     */
    int minimumDepth(Node root) {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;

        // Base case : Leaf Node. This accounts for height = 1.
        if (root.left == null && root.right == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minimumDepth(root.right) + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minimumDepth(root.left) + 1;

        return Math.min(minimumDepth(root.left),
                minimumDepth(root.right)) + 1;
    }
}