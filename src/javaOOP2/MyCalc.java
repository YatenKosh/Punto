package javaOOP2;

public class MyCalc {
    public static double calcPi(int n) {
        double c = 0;
        int d = 0;
        for (int i = 1; i < n; i += 2) {
            c +=Math.pow(-1, d) * (4.0 / i);
            d++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(calcPi(4));
    }
}
