package javaOOP2.TestCollection3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arr.add("numb_" + i);
            list.add("num_" + i);
        }
        ListIterator<String> arrayIterator = arr.listIterator();
        ListIterator<String> linkedIterator = list.listIterator();
        int count = 0;
        while (linkedIterator.hasNext()) {
            if (count == 6) {
                while (arrayIterator.hasNext()) {
                    linkedIterator.add(arrayIterator.next());
                }
            }
            linkedIterator.next();
            count++;
        }
        linkedIterator = list.listIterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + ", ");
        }
    }
}