package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

public class a13 {
    public static void main(String[] args) {
        int size = 70_000_000;
        long l1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
           list.add(i);
        }
        list.remove(5);
        // -5 =  АррЛиста6095ms
        // size/2 = АррЛиста5816ms
        // 5 = АррЛиста6213ms
        long l2 = System.currentTimeMillis();
        System.out.println("Время наполнения АррЛиста" + (l2 - l1) + "ms");
    }
}