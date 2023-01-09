package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 10;

        for (int i = 0; i < 10; i++) {
            array[i] = a--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Элементы в обратном порядке");
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
