package com.company;

import com.company.designpatterns.singleton.*;

public class Main {

    public static void main(String[] args) {

        /* Singleton Eager Initialization Design Pattern*/
        EagerInitializationSingleton.getINSTANCE().eagerInitTest();

        /* Singleton Static Block Initialization Design Pattern*/
        StaticBlockSingleton.getINSTANCE().staticBlockSingletonTest();

        /* Singleton Lazy Initialization Design Pattern*/
        LazySingleton.getINSTANCE().lazySingletonTest();

        /* Singleton ThreadSafe Initialization Design Pattern*/
        ThreadSafeSingleton.getINSTANCE().threadSafeSingletonTest();

        /* Singleton Bill Pugh Initialization Design Pattern*/
        BillPughSingleton.getINSTANCE().billPughSingletonTest();

    }
}
