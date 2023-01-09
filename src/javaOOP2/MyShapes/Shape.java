package javaOOP2.MyShapes;

import java.util.StringTokenizer;

public abstract class Shape implements Drawable {
    protected String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public static Shape parseShape(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
        String typeOfShape = stringTokenizer.nextToken();
        String shapeColor = stringTokenizer.nextToken();
        switch (typeOfShape) {
            case "Circle":
                return new Circle(shapeColor, Double.parseDouble(stringTokenizer.nextToken()));
            case "rectangle":
            case "triangle": {
                StringTokenizer stringTokenizer1 = new StringTokenizer(stringTokenizer.nextToken(), ",");
                return new rectangle(shapeColor, Double.parseDouble(stringTokenizer1.nextToken()), Double.parseDouble(stringTokenizer1.nextToken()));
            }
            default:
                return null;
        }
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is shape\ncolor is: " + shapeColor + "\nShape area is: " + calcArea();
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }


    public static void main(String[] args) {
        System.out.println(Circle.parseShape("Circle:Black:10"));
    }
}
