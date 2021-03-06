package com.company.implementations.linkedlist_implementation;

import java.util.HashSet;

/**
Detect loop in a linked list
Given a linked list, check if the the linked list has loop or not.

Use Hashing:
        Traverse the list one by one and keep putting the node addresses in a Hash Table. At any point,
        if NULL is reached then return false and if next of current node points to any of the previously
        stored nodes in Hash then return true.*/

public class LoopDetectionInLinkedList {
    private static Node head;  // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    private static void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    // Returns true if there is a loop in linked
    // list else returns false.
    private static boolean detectLoop(Node node) {
        HashSet<Node> set = new HashSet<Node>();
        while (node != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (set.contains(node))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            set.add(node);

            node = node.next;
        }

        return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        LoopDetectionInLinkedList llist = new LoopDetectionInLinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }
}
