package com.company.designpatterns.decorator;

public class PhoneDecorator implements Phone {

    protected Phone  iPhone;
    public PhoneDecorator(IPhone iPhone){
        this.iPhone=iPhone;
    }

    @Override
    public String getName() {
        return this.iPhone.getName();
    }

    @Override
    public int cameraCount() {
        return this.iPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return this.iPhone.getPrice();
    }
}
