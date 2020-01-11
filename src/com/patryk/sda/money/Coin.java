package com.patryk.sda.money;

public class Coin {
    public static final int DEFAULT_VALUE = 2;
    private static int totalValue = 0;
    private int value;

    public Coin() {
        this(DEFAULT_VALUE);
    }

    public Coin(int value) {
        totalValue += value;
        this.value = value;
    }

    public static int totalCoinValue(){
        return totalValue;
    }
}
