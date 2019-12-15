import java.util.Scanner;

public class ConditionalIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide your name, please: ");
        String name = scanner.nextLine();
        String expectedImie = "Patryk";
        if (name.equals(expectedImie) || name.equals("Zosia")) {
            System.out.println("Cześć Patryk!");
        } else {
            System.out.println("Hej, nie znam Cię " + name);
        }
    }
}
