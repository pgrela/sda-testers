package com.pgrela.sda.testers.introduction;

public class VariableRanges {
    private static String name = "Jack";
    public static void main(String[] args) {
        System.out.println(name);
        String name = "Robert";
        System.out.println(name);
        // String otherName = "Monica";
        {
            // String name = "Henry";
            String otherName = "Anna";
            System.out.println(otherName);
        }
        // System.out.println(otherName);
        String otherName = "Maria";
        System.out.println(otherName);
    }
}
