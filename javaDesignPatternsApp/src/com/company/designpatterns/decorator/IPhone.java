package com.company.designpatterns.decorator;

public class IPhone implements Phone{

    @Override
    public String getName() {
        return "Iphone ";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 499.90;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
