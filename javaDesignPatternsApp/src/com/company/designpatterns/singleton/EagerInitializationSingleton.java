package com.company.designpatterns.singleton;

public class EagerInitializationSingleton {

    /**
     * Disadvantage: When we don't need this class, Every time this application is installed , the instance going to crate itself.
     */

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    //Change Constructor to private
    private EagerInitializationSingleton(){}

    public  static EagerInitializationSingleton getINSTANCE() {
        return INSTANCE;
    }

    public void eagerInitTest(){
        System.out.println("Eager Initialization started");
    }
}
