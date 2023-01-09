package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw7 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int a = 10;
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Элементы в обратном порядке");
        for (int i = 0; i < 10; i++) {
            array[i] = a--;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Замена элементов местами");
        int b = array[0];
        array[0] = array[9];
        array[9] = b;

        int c = array[8];
        array[8] = array[1];
        array[1] = c;

        System.out.println(Arrays.toString(array));

    }
}
