package com.company.designpatterns.facade;

public class SHAEncryption {

    void encrypt(String text,String key, String bit){

        System.out.println("SHA : " + text + key + bit);
    }
}
