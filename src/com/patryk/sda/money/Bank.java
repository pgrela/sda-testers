package com.patryk.sda.money;

public class Bank {
    public static void main(String[] args) {
        System.out.println(Coin.totalCoinValue());
        new Coin(4);
        System.out.println(Coin.totalCoinValue());
        new Coin(2);
        System.out.println(Coin.totalCoinValue());
        new Coin();
        new Coin();
        new Coin();
        System.out.println(Coin.totalCoinValue());

        for (DniTygodnia dzien: DniTygodnia.values()) {
            System.out.println(dzien.name());
        }
    }
}
