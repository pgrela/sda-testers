package com.patryk.sda.zemsta;

public class Flegmatyk implements Pisarz {
    @Override
    public void napisz(String tekst) {
        System.out.println(tekst.toLowerCase());
    }

    public void spij(){
        System.out.println("Idę spać");
    }
}
