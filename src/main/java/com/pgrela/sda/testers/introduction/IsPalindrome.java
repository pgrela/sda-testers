package com.pgrela.sda.testers.introduction;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide text: ");
        String text = scanner.nextLine();

        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                System.out.println("It is not a palindrome.");
                return;
            }
        }
        System.out.println("It is a palindrome.");
    }
}
