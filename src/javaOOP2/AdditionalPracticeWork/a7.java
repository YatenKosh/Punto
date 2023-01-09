package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

public class a7 {
    public static void main(String[] args) {
        ArrayList<Object> inti = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            inti.add(i);
        }
        System.out.println(inti);
        for (int j = 5; j < 10; j++) {
            int a = (int) inti.get(j);
            inti.set(j, inti.get(j - 5));
            inti.set(j - 5, a);
        }
        System.out.println(inti);
    }
}