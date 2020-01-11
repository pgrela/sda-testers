public class Player {

    String name;
    String vocation;
    int level;

    public Player(String name) {
        this(name, "No vocation");
    }

    public Player(String name, String vocation) {
        this(name, vocation, 1);
    }

    public Player(String name, String vocation, int level) {
        if (name.equals("Ronnie")) {
            System.out.println("Witaj mistrzu!");
        }
        this.name = name;
        this.vocation = vocation;
        this.level = level;
    }
}
