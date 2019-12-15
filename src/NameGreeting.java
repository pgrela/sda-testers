import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide your name, please: ");
        String name = scanner.nextLine();

        char lastLetter = name.charAt(0);
        if (Character.isLowerCase(lastLetter)) {
            String firstLetterString = name.substring(0, 1);
            String capitalizedName =
                    firstLetterString.toUpperCase() + name.substring(1);
            System.out.printf("Szanuj się, %s!\n", capitalizedName);
        } else {
            System.out.printf("Cześć %s!\n", name);
        }

    }
}