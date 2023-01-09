package Fundamentals1;

import java.util.Arrays;

public class lesson165 {
//транспонирование матрицы
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        arr[0] = new int[]{1, 7, 9, 12};
        arr[1] = new int[]{2, 6, 10, 14};
        arr[2] = new int[]{5, 7, 41, 17};
        arr[3] = new int[]{4, 2, 12, 16};

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));

        }
    }
}