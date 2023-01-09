package javaOOP2.MyShapes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape[] arr = {
                new rectangle("Red", 1, 2),
                new rectangle("YELLOW", 3, 4),
                new rectangle("BLUE", 5, 6),
                new rectangle("DARK", 7, 8),
                new rectangle("ORANGE", 9, 10),
                new rectangle("GREEN", 11, 12),
                new Circle("PURPLE", 13),
                new Circle("BLACK", 14),
                new triangle("GRAY", 15, 16, 17),
                new triangle("PINK", 18, 19, 20)
        };
        for (Shape s : arr) {
            System.out.println(s + "\n");
        }
        System.out.println("\n");
        System.out.println("Circle = " + Circle.getSumAreaCircle());
        System.out.println("Rectangle = " + rectangle.getSumAreaRectangle());
        System.out.println("Triangle = " + triangle.getSumAreaTriangle() + "\n");
        rectangle[] arr2 = {new rectangle("WHITE", 21, 22),
                new rectangle("WHITE", 23, 24),
                new rectangle("WHITE", 25, 26),
                new rectangle("WHITE", 27, 28),
                new rectangle("WHITE", 29, 30),
                new rectangle("WHITE", 31, 32)
        };
        Arrays.sort(arr2);
        for (rectangle q : arr2) {
            q.draw();
        }
        Circle[] arr1 = {new Circle("GREEN", 33),
                new Circle("Yellow", 34),
                new Circle("RED", 35)};
        Arrays.sort(arr1, new shapeColorComparator());
        for (Circle w : arr1) {
            w.draw();
        }
        System.out.print("Введите название фигуры и ее параметры\n (rectangle:blue:2,4,6):");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        System.out.println(Shape.parseShape(phrase));
    }
}