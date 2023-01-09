package javaOOP2.TestMap1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MyTranslator {
    private final HashMap<String, String> dictionary;

    @Override
    public String toString() {
        return dictionary + "";
    }

    public MyTranslator() {
        dictionary = new HashMap<>();
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        return Arrays.stream(en.split(" "))          // создаем стрим из массива. Массив - строка разбитая по пробелам
                .map(dictionary::get)                      // Мапим каждый элемент из коллекции dictionary
                .collect(Collectors.joining(" ")); // собираем стрим в одну строку, прибавляя пробел между элементами
    }
}