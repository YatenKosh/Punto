package punto;

import java.util.HashMap;
import java.util.Map;

public class method {
    private static final Map<String, String> letters = new HashMap<>();
    static {
        letters.put("Q", "Й");
        letters.put("W", "Ц");
        letters.put("E", "У");
        letters.put("R", "К");
        letters.put("T", "Е");
        letters.put("Y", "Н");
        letters.put("U", "Г");
        letters.put("I", "Ш");
        letters.put("O", "Щ");
        letters.put("P", "З");
        letters.put("{", "Х");
        letters.put("}", "Ї");
        letters.put("A", "Ф");
        letters.put("S", "І");
        letters.put("D", "В");
        letters.put("F", "А");
        letters.put("G", "П");
        letters.put("H", "Р");
        letters.put("J", "О");
        letters.put("K", "Л");
        letters.put("L", "Д");
        letters.put(":", "Ж");
        letters.put("\"", "Є");
        letters.put("|", "\\");
        letters.put("Z", "Я");
        letters.put("X", "Ч");
        letters.put("C", "С");
        letters.put("V", "М");
        letters.put("B", "И");
        letters.put("N", "Т");
        letters.put("M", "Ь");
        letters.put("<", "Б");
        letters.put(">", "Ю");
        letters.put("?", ".");

        letters.put("q", "й");
        letters.put("w", "ц");
        letters.put("e", "у");
        letters.put("r", "к");
        letters.put("t", "е");
        letters.put("y", "н");
        letters.put("u", "г");
        letters.put("i", "ш");
        letters.put("o", "щ");
        letters.put("p", "з");
        letters.put("[", "х");
        letters.put("]", "ї");
        letters.put("a", "ф");
        letters.put("s", "і");
        letters.put("d", "в");
        letters.put("f", "а");
        letters.put("g", "п");
        letters.put("h", "р");
        letters.put("j", "о");
        letters.put("k", "л");
        letters.put("l", "д");
        letters.put(";", "ж");
        letters.put("'", "є");
        letters.put("\\", "\\");
        letters.put("z", "я");
        letters.put("x", "ч");
        letters.put("c", "с");
        letters.put("v", "м");
        letters.put("b", "и");
        letters.put("n", "т");
        letters.put("m", "ь");
        letters.put(",", "б");
        letters.put(".", "ю");
        letters.put("/", ".");
    }

    public static String toTranslit(String text) {
        StringBuilder sb = new StringBuilder(text.length());
        for (int i = 0; i<text.length(); i++) {
            String l = text.substring(i, i+1);
            sb.append(letters.getOrDefault(l, l));
        }
        return sb.toString();
    }
}