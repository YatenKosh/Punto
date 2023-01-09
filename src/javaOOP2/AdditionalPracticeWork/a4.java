package javaOOP2.AdditionalPracticeWork;

import java.util.Collections;
import java.util.LinkedList;

public class a4 {

    public static void main(String[] args) {
        LinkedList<Integer> inti = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            inti.add(i);
        }
        Collections.swap(inti, 4, 6);
        Collections.swap(inti, 5, 7);
        System.out.println(inti);
    }
}