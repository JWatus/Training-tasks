package com.company.implementations;

import java.util.Arrays;

public class ArrayListImplementation<T> {

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public ArrayListImplementation() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if (size == elements.length) {
            extendCapacity();
        }
        elements[size++] = t;
    }

    public void extendCapacity() {
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public Object remove(int index) {
        if (index < size || index >= 0) {
            Object obj = elements[index];
            elements[index] = null;
            int tmp = index;
            while (tmp < size) {
                elements[tmp] = elements[tmp + 1];
                elements[tmp + 1] = null;
                tmp++;
            }
            size--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (T) elements[i];
    }

    public int size() {
        return size;
    }
}
