import java.math.BigDecimal;
import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();
        float[] numbers = new float[numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = scanner.nextFloat();
        }


        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum / numberOfNumbers);
    }
}
