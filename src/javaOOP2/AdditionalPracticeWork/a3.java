package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;
import java.util.Collections;

public class a3 {
    public static void main(String[] args) {
        ArrayList<Integer> inti = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            inti.add(i);
        }          // поменять 0 и 9, 1 и 8 местами
        Collections.swap(inti, 0, 9);
        Collections.swap(inti, 1, 8);
        System.out.println(inti);
    }
}