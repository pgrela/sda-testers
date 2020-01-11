package com.patryk.sda.groups;

import com.patryk.sda.money.DniTygodnia;

public class GrupaWeekendowa implements GrupaKursantow {
    @Override
    public String nazwaGrupy() {
        return "TestWwa10";
    }

    @Override
    public int iloscOsob() {
        return 18;
    }

    @Override
    public String okrzykBojowy(DniTygodnia dzien) {
        if (dzien.equals(DniTygodnia.PONIEDZIALEK))
            return "Huura!";
        return "Eeeh...";
    }

    boolean pracaDomowa(){
        return true;
    }
}
