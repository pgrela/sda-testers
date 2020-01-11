package com.patryk.sda.groups;

import com.patryk.sda.money.DniTygodnia;

public interface GrupaKursantow {
    String nazwaGrupy();
    int iloscOsob();
    String okrzykBojowy(DniTygodnia dzien);
}
