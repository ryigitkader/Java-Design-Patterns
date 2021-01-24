package com.company.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    public static BillPughSingleton getINSTANCE(){

        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void billPughSingletonTest(){
        System.out.println("Bill Pugh singleton started.");
    }
}
