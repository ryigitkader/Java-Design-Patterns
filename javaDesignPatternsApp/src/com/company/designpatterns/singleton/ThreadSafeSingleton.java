package com.company.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton(){}

    /* Synchronized for multi thread */
    public static synchronized ThreadSafeSingleton getINSTANCE() {
        if(INSTANCE==null){
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

    public void threadSafeSingletonTest(){
        System.out.println("Thread Safe Singleton started");
    }
}
