package com.pgrela.sda.testers.introduction;

public class FloatingPointError {

    private static final int TEN_THOUSANDS = 10_000;

    public static void main(String[] args) {
        int aInt = 0;
        float aFloat = 0;
        double aDouble = 0;
        System.out.println("Before:");
        System.out.println(String.format("int    = %d", aInt));
        System.out.println(String.format("float  = %.2f", aFloat));
        System.out.println(String.format("double = %.2f", aDouble));
        for (int i = 0; i <= TEN_THOUSANDS; i++) {
            aInt += i;
            aFloat += i;
            aDouble += i;
        }
        System.out.println("After:");
        System.out.println(String.format("int    = %d", aInt));
        System.out.println(String.format("float  = %.2f", aFloat));
        System.out.println(String.format("double = %.2f", aDouble));
        System.out.println(String.format("correct= %d", TEN_THOUSANDS * (TEN_THOUSANDS + 1) / 2));

        System.out.println("Let' try to break a double:");
        aDouble = 1;
        for (int i = 0; i < 20; i++) {
            aDouble *= 10;
            System.out.println(String.format("double %.3f + 1 = %.3f", aDouble, aDouble + 1));
        }
    }
}
