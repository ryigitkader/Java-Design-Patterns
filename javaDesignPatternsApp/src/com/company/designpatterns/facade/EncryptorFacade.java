package com.company.designpatterns.facade;

public class EncryptorFacade {

    private AESEncryption aesEncryption = new AESEncryption();
    private MD5Encryption md5Encryption = new MD5Encryption();
    private SHAEncryption shaEncryption = new SHAEncryption();

    public void encrypt(String text,EncType encType){
        switch (encType){
            case AES:
                aesEncryption.encrypt(text);
                break;
            case SHA:
                shaEncryption.encrypt(text,"keyy","5");
                break;
            case MD5:
                md5Encryption.encrypt(text,"key123");
                break;
            default:
                throw  new IllegalArgumentException(encType.toString());
        }



    }

    public enum EncType {
        SHA,
        AES,
        MD5
    }
}
