public class StaticProperty {
    static String statycznyAtrybut = "statyczny";
    String niestatycznyAtrybut = "niestatyczny";
    public static void main(String[] args) {

        StaticProperty staticProperty = new StaticProperty();
        StaticProperty staticProperty2 = new StaticProperty();
        staticProperty.niestatycznyAtrybut = "a1";
        statycznyAtrybut = "stat5";
        staticProperty2.niestatycznyAtrybut = "a2";
    }
}
