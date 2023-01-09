package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw20 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 13, 91};
        int sum = 0;
        int n = array.length;
        int i = 0;
        System.out.println(Arrays.toString(array));
        System.out.println("\n");

        while (i < n) {
            sum = sum + array[i];
            i++;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}