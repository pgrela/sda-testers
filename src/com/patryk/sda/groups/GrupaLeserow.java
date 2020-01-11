package com.patryk.sda.groups;

import com.patryk.sda.money.DniTygodnia;

public class GrupaLeserow implements GrupaKursantow {
    @Override
    public String nazwaGrupy() {
        return "";
    }

    @Override
    public int iloscOsob() {
        return 0;
    }

    @Override
    public String okrzykBojowy(DniTygodnia dzien) {
        return "...";
    }
}
