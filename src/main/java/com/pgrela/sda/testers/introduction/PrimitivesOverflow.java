package com.pgrela.sda.testers.introduction;

public class PrimitivesOverflow {
    public static void main(String[] args) {
        byte aByte = 1;
        System.out.println("Setting number of type byte to " + aByte);
        while (aByte > 0) {
            aByte *= 10;
            System.out.println("After multiplying byte by 10, a=" + aByte);
        }
        short aShort = 1;
        System.out.println("Setting number of type short to " + aShort);
        while (aShort > 0) {
            aShort *= 10;
            System.out.println("After multiplying short by 10, a=" + aShort);
        }
        int aInt = 1;
        System.out.println("Setting number of type int to " + aInt);
        while (aInt > 0) {
            aInt *= 10;
            System.out.println("After multiplying integer by 10, a=" + aInt);
        }
        long aLong = 1;
        System.out.println("Setting number of type long to " + aLong);
        while (aLong > 0) {
            aLong *= 10;
            System.out.println("After multiplying long by 10, a=" + aLong);
        }
        float aFloat = 1;
        System.out.println("Setting number of type float to " + aFloat);
        while (aFloat < Float.POSITIVE_INFINITY) {
            aFloat *= 10;
            System.out.println("After multiplying float by 10, a=" + aFloat);
        }
        double aDouble = 1;
        System.out.println("Setting number of type double to " + aDouble);
        while (aDouble < Double.POSITIVE_INFINITY) {
            aDouble *= 10;
            System.out.println("After multiplying double by 10, a=" + aDouble);
        }
    }
}
