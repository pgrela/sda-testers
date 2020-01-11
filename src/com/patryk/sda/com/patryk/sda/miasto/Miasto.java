package com.patryk.sda.com.patryk.sda.miasto;

import com.patryk.sda.zoo.Zebra;

public class Miasto {
    public Zebra zeberka;

    public Miasto(Zebra zeberka) {
        this.zeberka = zeberka;
        zeberka = null;
    }
}
