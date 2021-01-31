package com.company.designpatterns.decorator;

public class DecorateRun {

    public static void main(String[] args) {

        Phone phone = new Iphone11(new IPhone() );
        Phone phone2 = new Iprhone11Pro(new IPhone());

        System.out.println(phone.getName());
        System.out.println(phone2.getName());
    }
}
