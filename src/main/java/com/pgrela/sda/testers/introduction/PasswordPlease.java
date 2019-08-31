package com.pgrela.sda.testers.introduction;

import java.util.Scanner;

public class PasswordPlease {


    public static final String THE_PASSWORD = "haslo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Password: ");
            String input = scanner.nextLine();
            if (THE_PASSWORD.equals(input)) {
                System.out.println("Password accepted.");
                System.out.println("The ultimate answer is 42.");
                break;
            }
            System.out.println("Wrong password!");
        } while (true);
    }
}
