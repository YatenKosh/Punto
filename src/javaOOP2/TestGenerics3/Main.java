package javaOOP2.TestGenerics3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] array1 = {"one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine", "ten"};
        MyMixer<Integer> myMixer = new MyMixer<Integer>(array);
        MyMixer<String> myMixer1 = new MyMixer<String>(array1);
        myMixer.shuffle(array);
        myMixer1.shuffle(array1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }
}
