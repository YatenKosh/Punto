package Fundamentals1.adhw;

// масив 5 на 5 в обратном порядке от 25
public class addhw23 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int a = 25;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a--;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
