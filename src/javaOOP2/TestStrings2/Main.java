package javaOOP2.TestStrings2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        String diff = myStr1.replaceAll("[" + myStr2 + "]", " "); // вывести все символы которые -
        System.out.println(diff);                                // есть в первом слове и которых нет во втором
    }
}
