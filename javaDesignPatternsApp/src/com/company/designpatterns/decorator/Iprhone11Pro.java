package com.company.designpatterns.decorator;

public class Iprhone11Pro extends Iphone11 {


    public Iprhone11Pro(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public String getName() {
        return iPhone.getName()+" Pro";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }
}

