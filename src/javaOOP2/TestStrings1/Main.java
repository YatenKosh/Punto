package javaOOP2.TestStrings1;

public class Main {

    public static String reverseString(String str) { //метод для вывода в обратном порядке символов
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.insert(0, str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("\n");
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra")); // нахождение символа ра в строке
        System.out.println(myStr.lastIndexOf("ra")); // нахождение последнего появления символа ра в строке
        for (int i = 3; i <= 7; i++) { //нахождение символов от 3 по 7 и вывод на экран всех символов вместе
            result.append(myStr.charAt(i));
        }
        System.out.println(result);

        System.out.println(Main.reverseString(myStr)); //использование  метода выше и вывод символов в обратном порядке
    }
}
