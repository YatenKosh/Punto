package Fundamentals1.adhw;

import java.util.Arrays;

public class addhw24 {
    public static void main(String[] args) {
//пузырьковая сортировка
        int[] array = new int[5];
        System.out.println("массив из рандомных чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 6));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        for (int b = array.length - 1; b > 0; b--) {
            for (int a = 0; a < b; a++) {
                if (array[b] > array[a]) {   // сравниваем значения из масива поочерёдно с последним знач.
                    int shift = array[b];      // создаём временную переменную ( для строк String , для чисел int )
                    // заносим в неё значение с array[b] ( буква "с" ровна числу с цикла(-8 потом 7 и т.д.)
                    array[b] = array[a];     // В переменную array[b] заносим значение из array[a]
                    array[a] = shift;          // С временной переменной shift заносим значение в array[a]
                }
            }
        }
        System.out.println(Arrays.toString(array));  // Выводим весь масив ( нужен import java.util.Arrays; )
    }
}
