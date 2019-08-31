package com.pgrela.sda.testers.introduction;

public class StringPlayground {
    public static void main(String[] args) {
        String name = "Steven";
        System.out.println("name = " + name);
        String nullString = null;
        System.out.println("nullString = " + nullString);
        System.out.println("Does javaScript contain java? " + "javaScript".contains("java"));
        String javaScript = "JavaScript";
        System.out.println("\"" + javaScript + "\".toUpperCase(): " + javaScript.toUpperCase());
        System.out.println("\"" + javaScript + "\".toLowerCase(): " + javaScript.toLowerCase());
        System.out.println("\"" + javaScript + "\".length(): " + javaScript.length());
        System.out.println("\"" + javaScript + "\".substring(0,6): " + javaScript.substring(0, 6));
        System.out.println("\"" + javaScript + "\".substring(2,3): " + javaScript.substring(2, 3));
        System.out.println("\"" + javaScript + "\".startsWith(\"Java\"): " + javaScript.startsWith("Java"));
        System.out.println("\"" + javaScript + "\".startsWith(\"python\"): " + javaScript.startsWith("python"));
        System.out.println("\"" + javaScript + "\".endsWith(\"Script\"): " + javaScript.endsWith("Script"));
        System.out.println("\"" + javaScript + "\".endsWith(\"script\"): " + javaScript.endsWith("script"));
    }
}
