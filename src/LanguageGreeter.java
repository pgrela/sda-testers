import java.util.Scanner;

public class LanguageGreeter {
    public static void main(String[] args) {
        System.out.println("I speak polish(1), english(2) und deutch(5).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What language do you want me to speak:");
        int preferredLanguage = scanner.nextInt();
        int t = 9;

        t += 7;

        switch (preferredLanguage) {
            case 1:
                System.out.println("Cześć!");
                break;
            case 5:
                System.out.println("Gutan Tag!");
                break;
            default:
                System.out.println("Hello!");
        }
        System.out.println("-----");
    }
}
