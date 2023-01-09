package Fundamentals1.adhw;

public class addhw19 {
    public static void main(String[] args) {

        int[] array = new int[6];
        int sum = 0;
        System.out.println("массив из рандомных чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 6));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int j : array) {
            sum += j;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}