package com.company.implementations.singleton_implementation;

public class SingletonExample {

    private static SingletonExample INSTANCE = null;

    public synchronized static SingletonExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}



