import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String wejscie = scanner.nextLine();
//        BigDecimal bigDecimal;
//        bigDecimal = new BigDecimal(wejscie);
//        System.out.println(bigDecimal);


        BigDecimal tax = new BigDecimal(10);
        System.out.println(tax);
        BigDecimal three = BigDecimal.valueOf(3);
        System.out.println(three);
        BigDecimal result = tax.divide(three,2, RoundingMode.HALF_UP);
        System.out.println(tax);
        System.out.println(three);
        System.out.println(result);
    }
}
