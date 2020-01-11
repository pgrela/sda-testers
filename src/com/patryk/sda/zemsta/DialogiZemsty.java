package com.patryk.sda.zemsta;

public class DialogiZemsty {
    public static void main(String[] args) {
        Pisarz autor = new Fredro();
        Flegmatyk rejentFlegmatyk = new Flegmatyk();
        Pisarz rejent = rejentFlegmatyk;
        Pisarz czesnik = new Choleryk();
        Pisarz patryk = new Choleryk();

        autor.napisz("Witamy w mojej baśni!");
        czesnik.napisz("Hej Gerwazy!");
        rejent.napisz("Ojej! Ojej!");
        patryk.napisz("Dziękuję za szkolenie, do jutra!");

        ((Flegmatyk)czesnik).spij();
    }
}
