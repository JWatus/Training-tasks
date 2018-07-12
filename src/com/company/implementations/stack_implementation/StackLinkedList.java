package com.company.implementations.stack_implementation;

/**
 * The stack is a fundamental data-structure used extensively in algorithm design and program implementation.
 * At an abstract level it can be described very simply, as it only allows for addition (pushing) of new and removal
 * (popping) of existing elements from the top of the stack. This description can be abbreviated to LIFO,
 * which stands for Last-In-First-Out.
 *
 * This implementation differs in that it creates a new node instance per addition, each storing their supplied value
 * and reference to the following node. These links allow us to keep the stack intact and eventually traverse the
 * entire collection, once emptied.
 * */

public class StackLinkedList<T> implements Stack<T> {

    private int size;
    private Node first;

    private class Node {
        private T ele;
        private Node next;
    }

    public StackLinkedList() {
    }

    public StackLinkedList<T> push(T ele) {
        Node current = first;
        first = new Node();
        first.ele = ele;
        first.next = current;
        size++;
        return this;
    }

    public T pop() {
        if (first == null)
            throw new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        size--;
        return ele;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        StackLinkedList<Integer> stackson = new StackLinkedList<>();
        stackson.push(90);
        System.out.println("On top of stack after first push is: " + stackson.first.ele);
        stackson.push(909090909);
        System.out.println("On top of stack after push is: " + stackson.first.ele);
        stackson.push(1111);
        System.out.println("On top of stack after push is: " + stackson.first.ele);
        stackson.pop();
        System.out.println("On top of stack after pop is: " + stackson.first.ele);
        stackson.pop();
        System.out.println("On top of stack after pop is: " + stackson.first.ele);
    }
}