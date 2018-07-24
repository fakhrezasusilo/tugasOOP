package com.example.user.cobaoopbinar;

import java.security.PrivateKey;

public class Hewan {
    public int kaki;
    private  String AlatNafas;

    public static Hewan(){

    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public String getAlatNafas() {
        return AlatNafas;
    }

    public void setAlatNafas(String alatNafas) {
        AlatNafas = alatNafas;
    }

    public Hewan(int kaki, String alatNafas) {
        this.kaki = kaki;
        AlatNafas = alatNafas;
    }
}
