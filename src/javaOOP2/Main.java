package javaOOP2;

import Fundamentals1.*;
import Fundamentals1.adhw.Car;

public class Main {
    public static void main(String[] args) {
        int[] cubon = new int[10];
        int[] rawe = new int[12];
        MyInit.printArray(cubon);
        System.out.println(" ");
        MyInit.printArray(rawe);
        System.out.println("\n" + "проверка класа инит тест" + "\n");
        InitTest clamb = new InitTest();
        System.out.println(clamb.getId());
        class Triangle {
            Integer a = 0;
            Integer b = 0;
            Integer c = 0;
        }
        lesson265.getArea(3,2,3);
        System.out.println("\n" + Apple.getWeight(15)  + " + " + Car.setWeight(764));
    }
}