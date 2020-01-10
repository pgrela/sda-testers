import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BlinkingChristmasTree {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private static final Map<Integer, String> COLORS = new HashMap<>();
    private static final String STAR = "*";
    private static final String AIR = " ";
    private static final int MILLISEDOND_INTERVAL = 400;
    private static final int LEFTMARGIN = 2;
    private static final int TOPMARGIN = 1;

    static {
        COLORS.put(0, ANSI_YELLOW);
        COLORS.put(1, ANSI_RED);
        COLORS.put(2, ANSI_BLUE);
        COLORS.put(3, ANSI_WHITE);
        COLORS.put(4, ANSI_CYAN);
        COLORS.put(5, ANSI_PURPLE);
    }

    private static Random random;

    public static void main(String[] args) throws InterruptedException {

        int treeHeight = 7;
        random = new Random(0);

        while (true) {
            String tree = createTree(treeHeight);
            System.out.println(tree);
            Thread.sleep(MILLISEDOND_INTERVAL);
            System.out.println("\033[" + (treeHeight + 3 + TOPMARGIN) + "A\033[9999C");
        }
    }

    private static String createTree(int treeHeight) {
        String tree = "\n".repeat(TOPMARGIN);
        for (int width = 0; width <= treeHeight; width++) {
            tree += AIR.repeat(LEFTMARGIN);
            tree += AIR.repeat(treeHeight - width);
            tree += stars(width * 2 + 1);
            tree += "\n";
        }
        tree += AIR.repeat(LEFTMARGIN);
        tree += AIR.repeat(treeHeight);
        tree += ANSI_GREEN + STAR + ANSI_RESET;
        return tree;
    }

    private static String stars(int width) {
        String row = "";
        for (int i = 0; i < width; i++) {
            row += colouredTreeBranch();
        }
        return row;
    }

    private static String colouredTreeBranch() {
        int i = random.nextInt(COLORS.size() * 4);
        if (i < COLORS.size())
            return COLORS.get(i) + STAR + ANSI_RESET;
        return ANSI_GREEN + STAR + ANSI_RESET;
    }
}
