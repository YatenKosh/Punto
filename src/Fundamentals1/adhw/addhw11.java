package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 10;
        for (int n = 0; n < 10; n++) {
            array[n] = a;
            a--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Вывести элементы с средины цыкла");
        for (int i = 0; i < 5; i++) {
            int temp = array[i];
            array[i] = array[5 + i];
            array[5 + i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}