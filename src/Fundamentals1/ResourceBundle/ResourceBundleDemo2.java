package Fundamentals1.ResourceBundle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");

        printInfo("en", "US");
        printInfo("uk", "UA");
    }

    private static void printInfo(String language, String country) {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            System.out.println(value);
        }
        System.out.println();
    }
}