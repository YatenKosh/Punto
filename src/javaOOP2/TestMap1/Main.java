package javaOOP2.TestMap1;

public class Main {
    public static void main(String[] args) {
        MyTranslator duk = new MyTranslator();
        duk.addNewWord("cat", "кот");
        duk.addNewWord("mouse", "мышь");
        duk.addNewWord("caught", "поймал");
        System.out.println(duk.translate("cat caught mouse"));
    }
}