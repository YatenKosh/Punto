package javaOOP2;

public class MyMath {

    public final static double PI = 3.14;
    public static double areaOfCircle(double r) {
        return Math.pow(r, 2) * PI;
    }

    public static void main(String[] args) {

        int[] array = new int[]{-1, 5, 3, 8, 4, 2, 77, 15, 19, 11, 1, 9};

        // Вызов метода Max () для получения максимального значения
        int max = findMax(array);
        System.out.println("Максимальное число: " + max);

        // Вызов метода Min () для получения минимального значения
        int min = findMin(array);
        System.out.println("Минимальное число: " + min);
    }
    //здесь находим максимум
    public static int findMax(int[] a) {
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    // здесь находим минимум
    public static int findMin(int[] b) {
        int minValue = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < minValue) {
                minValue = b[i];
            }
        }
        return minValue;
    }
}