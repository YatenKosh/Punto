package Fundamentals1.adhw;

import java.util.Arrays;
//замена элементов масива местами
public class addhw1 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        int y = array[2];
        array[2] = array[4];
        array[4] = y;
        System.out.println(Arrays.toString(array));
    }
}