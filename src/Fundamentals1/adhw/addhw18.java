package Fundamentals1.adhw;

public class addhw18 {
    public static void main(String[] args) {

    int[] array = {20, 33, 77, 44, 12, 3, 5, 3, 3, 9};
    int max = array[0];
    int i = 0;
        while (i < array.length)
    {
        if (array[i] > max) {
            max = array[i]; }
        i++;
    }

        System.out.println("Max is " + max);
}
}
