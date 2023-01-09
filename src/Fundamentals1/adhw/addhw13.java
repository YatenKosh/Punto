package Fundamentals1.adhw;

import java.util.Arrays;
//вывести элементы в обратном пороядке через 2 цифры
public class addhw13 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Вывести элементы с средины цыкла");
        for (int i = 0; i < 5; i++) {
            int a = array[i + i];
            array[i + i] = array[i + i + 1];
            array[i + i + 1] = a;
        }
        System.out.println(Arrays.toString(array));
    }
}
