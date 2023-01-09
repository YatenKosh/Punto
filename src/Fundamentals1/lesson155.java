package Fundamentals1;

import java.util.Scanner;

public class lesson155 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = 0;
        int number = input.nextInt();
       for (int a = 1; a <= number; a++) {
           sum += a;
        } System.out.println("The sum = " + sum + " result " + sum/number);
    }
}