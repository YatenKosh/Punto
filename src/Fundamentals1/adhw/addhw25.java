package Fundamentals1.adhw;

import java.util.Arrays;
//сортировка вставкой
public class addhw25 {
    public static void main(String[] args) {
        int[] array = new int[7];
        System.out.println("массив из рандомных чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 6));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int location = i - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
        System.out.println(Arrays.toString(array));
    }


}