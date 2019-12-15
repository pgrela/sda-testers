import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your income? ");
        int income = scanner.nextInt();
        if (income <= 1000) {
            System.out.println("Płacisz 0zł do US.");
        }
        if (1000 < income && income < 100_000) {
            System.out.printf("Płacisz %f do US\n",
                    (income - 1000) * 0.1);
        }
        if (income > 100_000) {
            System.out.printf("Płacisz %f do US\n",
                    9_900 + (income - 100_000) * 0.2);
        }
    }
}
