package javaOOP2.TestEnum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for (MyDayOfWeek s : values()) {
//            System.out.println(s);
//        }
//        MyDayOfWeek days = TUESDAY;
//
//        switch (days) {
//                case MONDAY:
//                case FRIDAY:
//                    System.out.println("It's homework time!");
//                    break;
//                case TUESDAY:
//                    System.out.println("My Java day: " + TUESDAY);
//                case WEDNESDAY:
//                    System.out.println("My english day: " + WEDNESDAY);
//                case THURSDAY:
//                    System.out.println("My Java day: " + THURSDAY);
//                    break;
//            }
//        System.out.println(MONDAY.nextDay());

        Scanner input = new Scanner(System.in);
        String d = input.nextLine();
        System.out.println(d + "\nThe next day of week: " +  MyDayOfWeek.valueOf(d).nextDay());
        }
    }