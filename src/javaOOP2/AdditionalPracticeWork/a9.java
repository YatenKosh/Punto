package javaOOP2.AdditionalPracticeWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class a9 {
    public static void main(String[] args) {
        ArrayList<Integer> inti = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            inti.add(i);
        }
        LinkedList<Integer> arr = new LinkedList<>();
// вставить колекцию в колекцию
        arr.addAll(inti);
        System.out.println(arr);
    }
}