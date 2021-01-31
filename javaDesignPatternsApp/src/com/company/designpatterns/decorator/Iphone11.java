package com.company.designpatterns.decorator;

public class Iphone11 extends PhoneDecorator{
    public Iphone11(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public double getPrice() {
        return iPhone.getPrice() +100;
    }

    @Override
    public String getName() {
        return iPhone.getName() + "11" ;
    }

    @Override
    public int cameraCount() {
        return iPhone.cameraCount()+1;
    }
}
