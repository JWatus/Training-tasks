package com.company.implementations.linkedlist_implementation;

public class Node {

    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public static Node insertInFront(Node head, Object data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }

    public static Node search(Node head, Object data) {
        while (head != null && head.data != data) {
            head = head.next;
        }
        return head;
    }

    Node delete(Node head, int data) {
        if (head.data.equals(data))
            return head.next;

        Node previous = null;
        Node current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                previous.next = current.next;
                return head;
            }
            else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    public Node insertInOrder(Node head, Node insert) {
        if (head == null)
            return null;

        Node previous = head;
        Node current = head.next;

        if (current == null) {
            if ((Integer) previous.data < (Integer) insert.data) {
                previous.next = insert;
                insert.next = null;
                return head;
            }
            else {
                insert.next = previous;
                return insert;
            }
        }

        while (current != null) {
            if ((Integer) previous.data < (Integer) insert.data && (Integer) current.data >= (Integer) insert.data) {
                previous.next = insert;
                insert.next = current;
                return head;
            }
            current = current.next;
            previous = previous.next;        }

        current = insert;
        insert.next = null;

        return head;
    }

    Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        Node forward;

        while (current != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }

}