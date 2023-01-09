package javaOOP2.MyShapes;

import java.lang.Math;

public class triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;
    public static double sumAreaTriangle = 0;

    public triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
        sumAreaTriangle += calcArea();
    }

    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double getSumAreaTriangle() {
        return sumAreaTriangle;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + shapeColor + ", a=" + a + ", b=" + b + ", c=" + c + "\nShape area is: " + calcArea();
    }

    public static void main(String[] args) {
        triangle trip = new triangle("BLACK", 5, 5, 5);
        System.out.println(trip);
        triangle rip = new triangle("BLACK", 5, 5, 5);
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle, color: " + shapeColor + ", a=" + a + ", b=" + b + ", c=" + c + "\nShape area is: " + calcArea());
    }
}
