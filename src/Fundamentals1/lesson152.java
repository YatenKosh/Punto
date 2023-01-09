package Fundamentals1;

import java.util.Scanner;

public class lesson152 {
    //програма вывода на экран строки вместо чисел
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9: ");
        int userinput = input.nextInt();
        if (userinput == 1) {
            System.out.println("One");
        } else if (userinput == 2) {
            System.out.println("Two");
        } else if (userinput == 3) {
            System.out.println("Three");
        } else if (userinput == 4) {
            System.out.println("Four");
        } else if (userinput == 5) {
            System.out.println("Five");
        } else if (userinput == 6) {
            System.out.println("Six");
        } else if (userinput == 7) {
            System.out.println("Seven");
        } else if (userinput == 8) {
            System.out.println("Eight");
        } else if (userinput == 9) {
            System.out.println("Nine");
        } else
            System.out.println("Не верное число \n не выделывайся");
    }
}