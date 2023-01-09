package javaOOP2.TestCollection1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            str.add("number_" + i);
        } // последовательный вывод числе от 0 до 9
        for (String s : str) {
            System.out.println(s);
        }
    }
}
