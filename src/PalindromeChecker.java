import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide text to check: ");
        String text = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            char leftChar = text.charAt(i);
            char rightChar = text.charAt(text.length() - 1 - i);
            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Tak, to jest palindrom.");
        } else {
            System.out.println("Tak, to NIE jest palindrom.");
        }
    }
}
