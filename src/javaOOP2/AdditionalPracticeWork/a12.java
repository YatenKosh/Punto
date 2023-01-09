package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class a12 {
    public static void main(String[] args) {
        int size = 80_000_000;//80_000_000 при числе 555 Время наполнения АррЛиста10217ms
        long l1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(555);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("Время наполнения АррЛиста" + (l2 - l1) + "ms");
        //арай лист хранит данные в непрерывном куске памяти, а линкед лист
        // выделяет память для каждого узла и связывает их ссылками
    }
}