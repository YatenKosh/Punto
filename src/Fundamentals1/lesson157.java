package Fundamentals1;

import java.util.Scanner;
//правильные числа от 1 до эн
public class lesson157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        for (int a = 1; a <= number; a++) {
            int c = 0;
            for (int b = 1; b < a; b++) {
                if (a % b == 0) {
                    c = c + b;
                }
            }
            if (c == a)
                System.out.println("Here is your perfect number: " + a);
        }
    }
}