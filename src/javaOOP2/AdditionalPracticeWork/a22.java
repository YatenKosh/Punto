package javaOOP2.AdditionalPracticeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class a22 {
    static void bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;   // устанавливаем в false в ожидании возможного свопа (замены местами)
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) { // изменить на > для сортировки по возрастанию
                    int temp = arr.get(j);          // меняем элементы местами
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;           // true означает, что замена местами была проведена
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        Random random = new Random(System.currentTimeMillis());
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            list.add(random.nextInt(10_000));
        }
        //используем пузырьковую сортировку
        bubbleSort(list);
        long l2 = System.currentTimeMillis();
        System.out.println("Время наполнения АррЛиста " + (l2 - l1) + "ms");
    }
}