package Fundamentals1.adhw;

public class addhw16 {
    public static void main(String[] args) {
        int[] array = {20, 33, 77, 44, 12, 3, 5, 3, 3, 9};
        int i = 0;
        int min = array[0];

        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        System.out.println("Min is " + min);
    }
}
