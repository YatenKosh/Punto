package javaOOP2;

public class Calculation {
    public static void main(String[] args) {


        int[] ball = {234, 24, 56, 29, 78678, 778};
        int[] sos = {74, 1265, 3456, 823, 567, 32, 4567, 2, 75,};

        int max = MyMath.findMax(ball);
        System.out.println("Максимальное значение: " + max);

        int min = MyMath.findMin(sos);
        System.out.println("Минимальное значение: " + min);

        double circle = MyMath.areaOfCircle(5);

        System.out.println(circle);
    }
}