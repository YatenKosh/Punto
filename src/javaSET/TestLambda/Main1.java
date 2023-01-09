package javaSET.TestLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main1 implements MyConverter {
    //сортировка фильтр цифр с помощью лямбда предитана с указанием
    // больше какой цыфры сортировку делать
    static void sumEven(int[] a, Predicate<Integer> b) {
        int[] st = Arrays.stream(a).boxed().toList().stream().filter(b)
                .toList().stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(st));
    }

    //сортировка фильтр стринга с помощью предиканта с указанием размера
// слова больше какого должно выводиться на экран
    static void printJStr(String[] str, Predicate<String> b) {
        Object[] st = Arrays.stream(str).filter(b).toArray();
        System.out.println(Arrays.toString(st));
    }

    static void updateList(List<String> str) {
        String[] strings = str.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);

        for (String s : strings) {
            System.out.print(s + " ");
        }
    }


    public static void main(String[] args) {
        int[] l = {1, 5, 29, 12, 34, 0, 24, 7, 18};
        sumEven(l, x -> x > 10);

        String[] strings = {"I", "Don`t", "understand", "what", "i", "should", "to", "do"};
        printJStr(strings, x -> x.length() > 4);

        Main1 main1 = new Main1();

        main1.convertStr("yaten");
        MyConverter.isNull("All night");

        List<String> words = Arrays.asList("I", "do", "it", "after", "all");
        updateList(words);
    }

    @Override
    public void convertStr(String str) {
        System.out.println(str.toUpperCase());
    }
}