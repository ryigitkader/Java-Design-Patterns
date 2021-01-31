package com.company.designpatterns.facade;

public class FacadeRunner {

    public static void main(String[] args) {

        String text = "Encrypt Me";
        /*
        AESEncryption aesEncryption = new AESEncryption();
        aesEncryption.encrypt(text);

        MD5Encryption md5Encryption = new MD5Encryption();
        md5Encryption.encrypt(text,"key123");

        SHAEncryption shaEncryption = new SHAEncryption();
        shaEncryption.encrypt(text,"keyy","5");
        */

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text, EncryptorFacade.EncType.AES);

        encryptorFacade.encrypt(text, EncryptorFacade.EncType.SHA);
    }
}
