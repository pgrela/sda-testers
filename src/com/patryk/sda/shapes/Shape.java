package com.patryk.sda.shapes;

public abstract class Shape {
    protected String color;

    public void setColor(String color){
        if(color==null){
            throw new IllegalArgumentException("No null color allowed");
        }
        this.color = color;
    }

    public final void draw(){
        System.out.println("Rysuję w kolorze " + color);
        drawSpecificShape();
    }

    abstract void drawSpecificShape();

}
