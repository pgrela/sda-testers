package com.patryk.sda.shapes;

public class Paper {
    public static void main(String[] args) {
        Shape shape1 = getShape1();
        String colorFromUser = getColorFromUser();
        try {
            shape1.setColor(colorFromUser);
        } catch (IllegalArgumentException e) {
            System.out.println("Nie ma takiego koloru");
        }
        Shape shape2 = getShape2();
        shape2.setColor("Black");

        shape1.draw();
        shape2.draw();
    }

    private static String getColorFromUser() {
        return null;
    }

    private static Shape getShape2() {
        return new Square();
    }

    private static Shape getShape1() {
        return new Circle();
    }
}
