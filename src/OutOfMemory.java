public class OutOfMemory {
    public static void main(String[] args) {
        while (true){
            new Object();
            new Object();
            new Object();
            new Object();
            new Object();
            new Object();
            new Object();
        }
    }
}
