package Fundamentals1.adhw;
//составить масим 5 на 5 от 1 до 25
public class addhw21 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}