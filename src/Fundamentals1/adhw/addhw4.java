package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 30;
        System.out.println("Элементы в обратном порядке");
        for (int i = 0; i < 10; i++) {
            array[i] = a--;
        }
        System.out.println(Arrays.toString(array));
    }
}