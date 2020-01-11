import java.util.Scanner;

public class MinTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 10;
        float[] numbers = new float[numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = scanner.nextFloat();
        }
        float min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
