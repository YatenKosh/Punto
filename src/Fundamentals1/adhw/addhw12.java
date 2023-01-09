package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 10;
        int n = 0;
        int i = 0;
        while (n < 10) {
            array[n] = a;
            n++;
            a--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Вывести элементы с средины цыкла");
        while (i < 5) {
            int temp = array[i];
            array[i] = array[5 + i];
            array[5 + i] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}