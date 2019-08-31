package com.pgrela.sda.testers.introduction;

public class Printing {
    public static void main(String[] args) {
        System.out.println("This is how println() works.");
        System.out.println("This is how println() works.");

        System.out.println("\n\n\n"); // just new lines

        System.out.print("This is how print() works.");
        System.out.print("This is how print() works.");

        System.out.println("\n\n\n"); // just new lines

        System.out.printf("This is how printf() works.");
        System.out.printf("This is how printf() works.");

        System.out.println("\n\n\n"); // just new lines

        String text = "other text";
        System.out.printf("This is what printf() can do: '%s' has length %d\n", text, text.length());
        System.out.printf("This is what printf() can do: '%s' has length %d\n", text, text.length());
    }
}
