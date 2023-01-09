package Fundamentals1;

import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {

        Scanner firstNumberScanner = new Scanner(System.in);
        System.out.println("Введите коректное число: ");
        int firstNumber = firstNumberScanner.nextInt();
       String operation;
       while (true) {
        System.out.println("Введите математическую операцию типа (+, -, /, *):");
        Scanner operationScanner = new Scanner(System.in);
        operation = operationScanner.nextLine();

        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            break;
        }
           System.out.println("Ошибка, введите правильную математическую операцию");
       }
        System.out.println("введите вторе число: ");
        Scanner secondNumberScanner = new Scanner(System.in);
        int secondNumber = secondNumberScanner.nextInt();
        double result;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
            case "-":
                result = firstNumber - secondNumber;
            case "*":
                result = firstNumber * secondNumber;
            default:
                result = firstNumber / (double)secondNumber;
        }
        System.out.println("Результат вычисления: \n" + result);
    }
}