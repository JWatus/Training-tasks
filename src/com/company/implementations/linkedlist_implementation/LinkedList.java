package com.company.implementations.linkedlist_implementation;

// Linked List in Java. Written by Joe James.
public class LinkedList {
    private Node root;      // root - pierwszy Node w liscie
    private int size;

    public LinkedList() {
        root = new Node();
        size = 0;
    }

    // Test code - main function
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.getSize());
        ll.add(8);
        System.out.println(ll.getSize());
        ll.add(17);
        ll.add(5);
        ll.add(10);
        System.out.println(ll.find(17).getData());
        ll.remove(5);
        System.out.println(ll.getSize());
        System.out.println(ll.find(5));
    }

    public Node add(int data) {                 // dodajemy Node na początek listy, root się zmienia
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    public Node find(int data) {
        Node thisNode = this.root;

        while (thisNode != null) {
            if (thisNode.getData() == data)
                return thisNode;
            thisNode = thisNode.getNextNode();
        }
        return null;
    }

    public boolean remove(int data) {
        Node thisNode = this.root;
        Node prevNode = null;       // startuje jako null bo nie ma Node poprzedzającego root

        while (thisNode != null) {
            if (thisNode.getData() == data) {
                if (prevNode != null)
                    prevNode.setNextNode(thisNode.getNextNode());   // przekierowujemy wskaznik next node na kolejny Node
                else                                                // (omija ten wyrzucany)
                    this.root = null;
                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();
        }
        return false;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public int getSize() {
        return this.size;
    }

    // Node class
    private class Node {
        private Node nextNode;
        private int data;

        // 0-arg constructor, 1-arg constructor, 2-arg constructor
        private Node() {
        }

        private Node(int val) {
            data = val;
        }

        private Node(int val, Node next) {
            data = val;
            nextNode = next;
        }

        private void setData(int val) {
            this.data = val;
        }

        private int getData() {
            return this.data;
        }

        private void setNextNode(Node n) {
            this.nextNode = n;
        }

        private Node getNextNode() {
            return this.nextNode;
        }
    }
}