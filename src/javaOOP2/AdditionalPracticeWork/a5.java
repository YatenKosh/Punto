package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;

public class a5 {
    public static void main(String[] args) {
        ArrayList<Integer> inti = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            inti.add(i);
        }
        for (int i = inti.size() - 1; i >= 0; i--) {
            System.out.print(inti.get(i) + " ");
        }
    }
}