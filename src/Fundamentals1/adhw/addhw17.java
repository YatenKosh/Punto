package Fundamentals1.adhw;

//максимальное число масива
public class addhw17 {
    public static void main(String[] args) {
        int[] array = {20, 33, 77, 44, 12, 3, 5, 3, 3, 9};
        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println("Max is " + max);
    }
}