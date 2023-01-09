package javaOOP2.MyShapes;

import org.jetbrains.annotations.NotNull;

public class Circle extends Shape implements Comparable, Drawable {
    private final double radius;
    public static double sumAreaCircle = 0;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
        sumAreaCircle += calcArea();
    }

   public static double getSumAreaCircle() {
        return sumAreaCircle;
    }

      public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + shapeColor + ", radius =" + radius + "\nShape area is: " + calcArea();
    }

        @Override
    public int compareTo(@NotNull Object t) {
            Circle circle = (Circle) t;
            if (circle.radius > this.radius) return -1;
            else if (circle.shapeColor.length() > this.shapeColor.length()) {
                return 1;
            } else return 0;

        }

    public static void main(String[] args) {
        Circle kub = new Circle("GREEN", 10);
        System.out.println(kub);
        Circle face = new Circle("RED", 13);
        System.out.println(kub.compareTo(face));
    }

    @Override
    public void draw() {
        System.out.println("This is Circle, color: " + shapeColor + ", radius =" + radius + "\nShape area is: " + calcArea());
    }
}

