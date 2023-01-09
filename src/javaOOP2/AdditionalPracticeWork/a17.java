package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

public class a17 {
    public static void main(String[] args) {
        int size = 70_000_000;//80_000_000 при числе 555 Время наполнения АррЛиста10746ms
        long l1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.set(size - 5, 777);
        // 5,777 = АррЛиста5715ms
        // size/2 = АррЛиста5769ms
        // size - 5 = АррЛиста5568ms
        long l2 = System.currentTimeMillis();
        System.out.println("Время наполнения АррЛиста" + (l2 - l1) + "ms"); // АррЛиста6149ms
        //арай лист хранит данные в непрерывном куске памяти, а линкед лист
        // выделяет память для каждого узла и связывает их ссылками
    }
}