package Fundamentals1.adhw;

//минимальное число масива
public class addhw15 {
    public static void main(String[] args) {
        int[] array = {20, 33, 77, 44, 12, 3, 5, 3, 3, 9};
        int min = array[0];
        for (int j : array) {
            if (j < min)
                min = j;
        }
        System.out.println("Min is " + min);
    }
}