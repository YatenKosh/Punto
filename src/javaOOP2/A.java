package javaOOP2;

public class A {
    static {
        Rectangle obj = new Rectangle();
        // Calling function
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Circle obj1 = new Circle();
        // Calling function
        obj1.Area(3);
        obj1.Area(5.5);
        Square obj2 = new Square();
        // Calling function
        obj2.Area(20);
        obj2.Area();
    }

    static class Square {
        // Overloaded function to
        // calculate the area of the square
        // It takes one double parameter
        void Area() {
            System.out.println("Area of the Square: " + 5.2 * 5.2);
        }

        // Overloaded function to
        // calculate the area of the square
        // It takes one float parameter
        void Area(float side) {
            System.out.println("Area of the Square: " + side * side);
        }
    }

    static class Circle {
        static final double PI = Math.PI;

        // Overloaded function to
        // calculate the area of the circle.
        // It takes one double parameter
        void Area(double r) {
            double A = PI * r * r;
            System.out.println("The area of the circle is :" + A);
        }

        // Overloaded function to
        // calculate the area of the circle.
        // It takes one float parameter
        void Area(float r) {
            double A = PI * r * r;
            System.out.println("The area of the circle is :" + A);
        }
    }

    static class Rectangle {
        // Overloaded function to
        // calculate the area of the rectangle
        // It takes two double parameters
        void Area(double l, double b) {
            System.out.println("Area of the rectangle: " + l * b);
        }

        // Overloaded function to
        // calculate the area of the rectangle.
        // It takes two float parameters
        void Area(int l, int b) {
            System.out.println("Area of the rectangle: " + l * b);
        }
    }

    public static void main(String[] args) {
        CalculateArea ob = new CalculateArea();
        ob.area(4);
        ob.area(10, 12);
        ob.area(5.5);
    }

    static class CalculateArea {
        void area(float x) {
            System.out.println("Площадь квадрата " + Math.pow(x, 2) + " sq units");
        }

        void area(float x, float y) {
            System.out.println("Площадь прямоугольника " + x * y + " sq units");
        }

        void area(double x) {
            double z = 3.14 * x * x;
            System.out.println("Площадь круга " + z + " sq units");
        }
    }
}