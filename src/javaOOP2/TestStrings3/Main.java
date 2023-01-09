package javaOOP2.TestStrings3;

public class Main {

    public static char[] uniqueChars(String s) {
        char[] arr = new char[s.length()];
        int index = 0;
        boolean t = false;
        for (int i = 0; i < s.length(); i++) {
            for (int e = 0; e < s.length(); e++) {
                if (s.charAt(i) == s.charAt(e) && i != e) {
                    t = true;
                    break;
                }
            }
            if (!t) {
                arr[index++] = s.charAt(i);
            }
            t = false;
        }
        return arr;
    }

    public static void main(String[] args) {
        String s = "Using methods of class String";
        char[] o = uniqueChars(s);
        System.out.println("Уникальные символы:");
        for (char c : o) {
            if (c != '\u0000')
                System.out.print(c + " ");
        }
    }

}
