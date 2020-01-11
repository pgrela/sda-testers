import java.text.SimpleDateFormat;
import java.util.Date;

public class Journal {
    public static void main(String[] args) {

        String wpis1 = "Dzień 1, idziemy w góry.";
        zanotuj(wpis1);

        System.out.println("Dzień 2, wracamy z gór.");

        zanotuj("Dzień 2 wieczór, grill.");

    }

    static void zanotuj(String wpis) {
        SimpleDateFormat formatter =
                new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.print(formatter.format(date));
        System.out.print(" ");
        System.out.println(wpis);
    }
}
