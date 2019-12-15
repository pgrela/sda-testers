import java.util.Scanner;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String text = sc.nextLine();
        int textLength = text.length();
        boolean isPalindrome = true;
        int fromStart = 0;
        int fromEnd = (textLength - 1);
        while ( fromStart < textLength ) {
            if (text.charAt(fromStart) != text.charAt(fromEnd)) {
                isPalindrome = false;
                break;
            }
            fromStart++;
            fromEnd--;
        }
        if (isPalindrome)
            System.out.println("Jest palindromem");
        else {
            System.out.println("Nie jest palindromem");
        }
    }
}