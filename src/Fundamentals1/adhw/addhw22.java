package Fundamentals1.adhw;

public class addhw22 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int a = 1;
        int i = 0;
        int j = 0;
        while (i < array.length) {
            while (j < array[i].length) {
                array[i][j] = a++;
                System.out.print(array[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
