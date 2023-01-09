package javaOOP2.AdditionalPracticeWork;

import java.util.LinkedList;

public class a6 {
    public static void main(String[] args) {
        LinkedList<Integer> inti = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            inti.add(i);
        }
        for (int i = inti.size() - 1; i >= 0; i--) {
            System.out.print(inti.get(i) + " ");
        }
    }
}
