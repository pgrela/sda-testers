package com.patryk.sda.groups;

import com.patryk.sda.money.DniTygodnia;

public class FirmaSzkoleniowa {
    public static void main(String[] args) {
        GrupaKursantow grupa1 = new GrupaWeekendowa();
        GrupaKursantow grupa2 = new GrupaLeserow();

        System.out.println(grupa1.okrzykBojowy(DniTygodnia.PONIEDZIALEK));
        System.out.println(grupa2.okrzykBojowy(DniTygodnia.PONIEDZIALEK));
    }
}
