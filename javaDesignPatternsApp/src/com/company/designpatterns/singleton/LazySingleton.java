package com.company.designpatterns.singleton;

public class LazySingleton {

    /**
     * Disadvantage: not ThreadSafe
     */
    private static LazySingleton INSTANCE ;

    private LazySingleton(){}

    public static LazySingleton getINSTANCE() {
        if(INSTANCE==null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public void lazySingletonTest(){
        System.out.println("Lazy Singleton started");
    }
}
