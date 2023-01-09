package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//колекция рандомных чисел
public class a10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10_000));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}