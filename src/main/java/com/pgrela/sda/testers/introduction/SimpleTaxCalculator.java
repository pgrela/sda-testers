package com.pgrela.sda.testers.introduction;

public class SimpleTaxCalculator {
    public static void main(String[] args) {
        int freeOfTaxes = 8000;
        int threshold = 85528;
        int firstTaxThreshold = 18;
        int secondTaxThreshold = 32;

        int myIncome = 50000;

        if (myIncome <= freeOfTaxes) {
            System.out.println("You do not pay any taxes! Huura!!!");
            return;
        }
        int tax;
        if (myIncome <= threshold) {
            tax = (myIncome - freeOfTaxes) * firstTaxThreshold / 100;
        } else {
            tax = (myIncome - threshold) * secondTaxThreshold / 100 + 15395;
        }
        System.out.printf("You need to pay %d tax\n", tax);
    }
}
