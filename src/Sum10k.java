public class Sum10k {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i <= 10000; ++i) {
            sum = sum + i;
        }
        System.out.printf("%.0f\n", sum);
        sum=0;
        for (int i = 0; i <= 10000; ++i) {
            sum = sum + i;
        }
        System.out.printf("%.0f\n", sum);
    }
}
