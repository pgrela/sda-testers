public class FactorialAndFibonacci {
    public static void main(String[] args) {
        System.out.println(silnia(4));
        data(11, 12, 10);
        System.out.println(fibonacci(7));
    }

    private static int silnia(int n) {
        if (n == 0) return 1;
        return n * silnia(n - 1);
    }

    private static int fibonacci(int numerElementu) {
        if (numerElementu == 0) return 0;
        if (numerElementu == 1) return 1;
        return fibonacci(numerElementu - 1)
                + fibonacci(numerElementu - 2);

    }

    static void data(int rok, int miesiac, int dzien) {
    }
}
