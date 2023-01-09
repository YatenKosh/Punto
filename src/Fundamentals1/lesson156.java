package Fundamentals1;

import java.util.Scanner;

public class lesson156 {
    public static void main(String[] args) {
        System.out.println("возведение в степень:");
        //калькулятор
        Scanner kwa = new Scanner(System.in);
        int n = kwa.nextInt();
        values(n);
    }
    public static void values(int n) {
        int rem;
        int sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        System.out.println(sum);
    }
}