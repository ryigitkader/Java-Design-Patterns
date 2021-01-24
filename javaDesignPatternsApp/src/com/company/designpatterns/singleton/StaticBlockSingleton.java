package com.company.designpatterns.singleton;

public class StaticBlockSingleton {

    /**
     * Disadvantage: When we don't need this class, Every time this application is installed , the instance going to crate itself.
     */

    private static StaticBlockSingleton INSTANCE ;

    /* Method to run when the application is first started */
    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
        }
    }

    private StaticBlockSingleton(){}

    public static StaticBlockSingleton getINSTANCE() {
        return INSTANCE;
    }

    public void staticBlockSingletonTest(){
        System.out.println("Static Block Singleton started");
    }
}
