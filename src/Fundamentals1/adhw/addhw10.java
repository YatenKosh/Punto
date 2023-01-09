package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw10 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int i = 0;
        System.out.println(Arrays.toString(array));
        System.out.println("Элементы в обратном порядке");
        while (i < 10) {
            array[i] = i + 1;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
