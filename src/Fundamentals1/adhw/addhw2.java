package Fundamentals1.adhw;

import java.util.Arrays;
//заполнить масив в порядке возрастания от 1 до 10 с помощью фор
public class addhw2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}