package com.patryk.sda.zemsta;

public class Choleryk implements Pisarz {
    @Override
    public void napisz(String tekst) {
        System.out.println(tekst.toUpperCase());
    }
}
