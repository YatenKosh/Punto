package Fundamentals1;

public class lesson265 {
    double a;
    double b;
    double c;
    public lesson265(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void getArea(int a, int b, int c) {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("\n" + "Площать треугольника равна: " + s);
    }
}