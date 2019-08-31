package com.pgrela.sda.testers.introduction;

public class IfElse {

    public static void main(String[] args) {
        boolean condition = false;
        System.out.println("The condition is " + condition);
        if (condition) {
            System.out.println("It is true!");
        } else {
            System.out.println("It is false!");
        }
        condition = true;

        System.out.println("The condition is " + condition);
        if (condition) {
            System.out.println("It is true!");
        } else {
            System.out.println("It is false!");
        }
    }
}