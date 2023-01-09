package javaOOP2.TestCollection2;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            str.add("number_" + i);
        } // рандомное смешивание колекции типа лист
        Collections.shuffle(str);
        for (String s : str) {
            System.out.println(s);
        }

    }
}
