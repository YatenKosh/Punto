package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

public class a18 {
    public static void main(String[] args) {
        int size = 70_000_000; //70
        long l1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.add(5, 333);
        // 5,333 - АррЛиста5847ms
        //size/2, 333 - АррЛиста5702ms
        // size -5,333 - АррЛиста5516ms
        //Так как это ArrayList, то вставка подразумевает перезапись
        // последующих элементов на одну ячейку памяти правее(если представлять как строку)
        long l2 = System.currentTimeMillis();
        System.out.println("Время наполнения АррЛиста" + (l2 - l1) + "ms");
    }
}