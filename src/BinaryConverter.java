import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me number ");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.println("number = " + number);
            number = number / 2;
        }
        System.out.println();
    }
}
