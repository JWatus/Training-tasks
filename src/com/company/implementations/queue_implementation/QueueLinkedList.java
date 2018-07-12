package com.company.implementations.queue_implementation;

/**
 * The queue only allows mutation via two methods.
 * Addition (enqueue) occurs at the end of the collection, and removal (dequeue) from the beginning,
 * resulting in a FIFO (First-In-First-Out) structure.
 * <p>
 * Adding an item to the queue first stores a temporary reference to the current ‘last’ element of the list.
 * The structure is then able to go about storing the new node instance referenced by the ‘last’ variable.
 * If previously the collection was empty we set the ‘first’ element to this new item as well as the consistent
 * last reference.
 * <p>
 * However, in the case that there are already items present, we simply set the previous last elements ‘next’
 * reference to this new node. Removing (dequeuing) elements from the collection is also a trivial task, simply
 * returning the node referenced from the ‘first’ variable. This reference is then updated to the returned nodes
 * ‘next’ reference, and a simple check to clear the last reference if the collection is now empty takes place.
 */

public class QueueLinkedList<T> implements Queue<T> {

    private int size;
    private Node first;
    private Node last;

    private class Node {
        private T ele;
        private Node next;
    }

    public QueueLinkedList() {
    }

    public QueueLinkedList<T> enqueue(T ele) {
        Node current = last;
        last = new Node();
        last.ele = ele;

        if (size++ == 0)
            first = last;
        else
            current.next = last;

        return this;
    }

    public T dequeue() {
        if (size == 0)
            throw new java.util.NoSuchElementException();

        T ele = first.ele;
        first = first.next;

        if (--size == 0)
            last = null;
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

        QueueLinkedList<Integer> lista = new QueueLinkedList<>();
        lista.enqueue(777);
        System.out.println("First element of the queue: " + lista.first.ele);
        System.out.println("Last element of the queue: " + lista.last.ele);
        lista.enqueue(3333);
        System.out.println("\nFirst element of the queue: " + lista.first.ele);
        System.out.println("Last element of the queue after add: " + lista.last.ele);
        lista.enqueue(-111111);
        System.out.println("\nFirst element of the queue: " + lista.first.ele);
        System.out.println("Last element of the queue after add: " + lista.last.ele);
        lista.dequeue();
        System.out.println("\nFirst element of the queue after remove: " + lista.first.ele);
        System.out.println("Last element of the queue: " + lista.last.ele);
    }
}