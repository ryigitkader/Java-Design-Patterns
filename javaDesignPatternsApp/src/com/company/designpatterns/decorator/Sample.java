package com.company.designpatterns.decorator;

public class Sample {

    public static class Iphone11{
        String name(){

            return "Iphone11";
        }
        int getCameraCount(){
            return 2;
        }
    }

    public static class Iphone11Pro{

        String name(){

            return "Iphone11Pro";
        }

        int getCameraCount(){
            return 3;
        }
    }

    public static class Iphone11Max{

        String name(){

            return "Iphone11Max";
        }

        int getCameraCount(){
            return 3;
        }
    }
}
