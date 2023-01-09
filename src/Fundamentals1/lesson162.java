package Fundamentals1;

public class lesson162 {
 // вычисление максимального минимального и среднего значения из масива
    public static void main(String[] args) {
        int[] m = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min, max;
        min = max = m[0];

        int smallest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        int sum = 0;

        for (int value : m) {
            sum += value;
            smallest = Math.min(smallest, value);
            highest = Math.max(highest, value);
        }

        int average = (sum - smallest - highest) / (m.length - 2);

        for (int i = 1; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.print("min is: " + min + "; max is: " + max + "; average is: " + average);
    }
}