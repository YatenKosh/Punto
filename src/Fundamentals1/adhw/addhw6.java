package Fundamentals1.adhw;

import java.util.Arrays;
//поменять местами 0 и 9 элементв  масиве
public class addhw6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        int b = array[0];
        array[0] = array[9];
        array[9] = b;

        System.out.println(Arrays.toString(array));
    }
}