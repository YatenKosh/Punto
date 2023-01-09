package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw5 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int a = 30;
        int i = 0;

        System.out.println("Элементы в обратном порядке");
        do {
            array[i] = a--;
            i++;
        } while (i < 10);

        System.out.println(Arrays.toString(array));
    }
}


