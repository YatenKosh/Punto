package javaOOP2.MyShapes;

import java.util.StringTokenizer;

public class rectangle extends Shape implements Drawable, Comparable<rectangle> {
    private final double width;
    private final double height;
    private static double sumAreaRectangle = 0;

    public rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
        sumAreaRectangle += calcArea();
    }

    public double calcArea() {
        return width * height;
    }

    public static double getSumAreaRectangle() {
        return sumAreaRectangle;
    }


    @Override
    public String toString() {
        return "This is Rectangle, color: " + shapeColor + ", width=" + width + ", height=" + height + "\nShape area is: " + calcArea();
    }

    @Override
    public int compareTo(rectangle that) {
        return Double.compare(that.calcArea(), this.calcArea());

    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle, color: " + shapeColor + ", width=" + width + ", height=" + height + "\nShape area is: " + calcArea());
    }

    public static Shape parseRectangle(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
        String shapeColor = stringTokenizer.nextToken();
        return new rectangle(shapeColor, Double.parseDouble(stringTokenizer.nextToken()), Double.parseDouble(stringTokenizer.nextToken()));
    }

    public static void main(String[] args) {
        rectangle tang = new rectangle("RED", 11, 22);
        System.out.println(tang + "\n");
        rectangle lang = new rectangle("RED", 22, 10);
        System.out.println(lang);

        System.out.println(tang.compareTo(lang));

        System.out.println(rectangle.parseRectangle("Red:5:6"));



    }
}
