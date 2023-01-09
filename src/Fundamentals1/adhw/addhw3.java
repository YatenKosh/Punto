package Fundamentals1.adhw;

import java.util.Arrays;
//заполнить масив в порядке возрастания от 1 до 10 с помощью вайл
public class addhw3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        while (i < 10) {
            array[i] = i + 1;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}