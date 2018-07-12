package com.company.implementations.queue_implementation;

interface Queue<T> {
    Queue<T> enqueue(T ele);
    T dequeue();
}