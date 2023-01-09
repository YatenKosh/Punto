package Fundamentals1.ResourceBundle;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("uk", "UA");
    }
// если отображается абракадабра в консоле измени раскладку через блокнот в файле пропертисти где указан текст
    private static void printInfo(String language, String country) {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        String s1 = rb.getString("str1");
        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
        System.out.println();
    }
}