package javaOOP2.TestGenerics2;

public class main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] arra = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9};

        System.out.println(MyTestMethod.calcNum(array, 6));
        System.out.println(MyTestMethod.calcNum(arra, 4.3));
    }
}