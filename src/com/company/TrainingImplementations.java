package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class TrainingImplementations {

    public static void main(String[] args) {

        System.out.println("ArrayList implementation\n");
        ArrayListImplementation arrayListImplementation = new ArrayListImplementation();
        arrayListImplementation.addElement(4);
        arrayListImplementation.addElement(40);
        arrayListImplementation.addElement(453);
        arrayListImplementation.addElement(987);
        for (int i = 0; i < arrayListImplementation.size; i++) {
            System.out.println("Element at index: " + i + " is equal: " + arrayListImplementation.get(i));
        }
        System.out.println("Size of list is: " + arrayListImplementation.size());

        arrayListImplementation.remove(2);
        System.out.println("After removal");
        for (int i = 0; i < arrayListImplementation.size; i++) {
            System.out.println("Element at index: " + i + " is equal: " + arrayListImplementation.get(i));
        }
        System.out.println("Size of list after removing element is: " + arrayListImplementation.size());


        System.out.println("\nLinkedList implementation\n");
        LinkedListImplementation ll = new LinkedListImplementation();
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

    private static class QueueImplementation<T> {

        Node first;
        Node last;
        int size;

        private class Node {
            Node next;
            T element;
        }

        private void addToQueue(T element) {

            Node current = last;
            last = new Node();
            last.element = element;

            if (size++ == 0)
                first = last;
            else
                current.next = last;
        }

        private void removeFromQueue() {

            if (size == 0)
                throw new java.util.NoSuchElementException();

            first.next = first;

            if (--size == 0)
                last = null;
        }
    }

    private static class StackImplementation<T> {
        Node first;
        int size;

        private class Node {
            Node next;
            T element;
        }

        private void addToStack(T element) {
            Node current = first;
            first = new Node();
            first.next = current;
            first.element = element;
            size++;
        }

        private void removeFromStack() {
            if (first == null)
                throw new java.util.NoSuchElementException();

            if (!(first.next == null))
                first = first.next;
            size--;
        }
    }

    private static class ArrayListImplementation {
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        private ArrayListImplementation() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        private void addElement(Object o) {
            if (elements.length == size) {
                int newSize = size * 2;
                elements = Arrays.copyOf(elements, newSize);
            }
            elements[size++] = o;
        }

        private Object get(int i) {
            if (i < 0 || i >= size)
                throw new ArrayIndexOutOfBoundsException();
            else {
                return elements[i];
            }
        }

        private int size() {
            return this.size;
        }

        private void remove(int index) {
            if (index < 0 || index >= size)
                throw new ArrayIndexOutOfBoundsException();
            else {
                while (index < elements.length - 1) {
                    elements[index] = elements[index + 1];
                    elements[index + 1] = null;
                    index++;
                }
            }
            size--;
        }
    }

    private static class LinkedListImplementation<T> {
        private Node root;
        private int size;

        private LinkedListImplementation() {
            root = new Node();
            size = 0;
        }

        public Node add(int data) {
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
            Node prevNode = null;

            while (thisNode != null) {
                if (thisNode.getData() == data) {
                    if (prevNode != null)
                        prevNode.setNextNode(thisNode.getNextNode());
                    else
                        this.root = null;
                    this.setSize(this.getSize() - 1);
                    return true;
                }
                prevNode = thisNode;
                thisNode = thisNode.getNextNode();
            }
            return false;
        }

        private boolean detectLoop(Node node) {
            HashSet<Node> set = new HashSet<Node>();
            while (node != null) {
                if (set.contains(node))
                    return true;
                set.add(node);
                node = node.getNextNode();
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
}