package com.pgrela.sda.testers.introduction;

public class Switch {

    public static void main(String[] args) {
        String name = "Anna";
        switch (name) {
            case "Patryk":
                System.out.println("Hello Patryk! How do you do?");
                break;
            case "Anna":
                System.out.println("Hello Anna! How are you?");
                break;
            case "Robert":
                System.out.println("Hello Robert! Where have you been?");
                break;
            default:
                System.out.println("We haven't met, have we?");
        }
    }
}