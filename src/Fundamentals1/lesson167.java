package Fundamentals1;

public class lesson167 {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[1][1] = 1;
        array[1][3] = 1;
        array[2][4] = 1;
        array[3][3] = 1;
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}