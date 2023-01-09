package javaOOP2.AdditionalPracticeWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

@SuppressWarnings("ALL")
public class a11 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10_000));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}