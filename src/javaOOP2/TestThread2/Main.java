package javaOOP2.TestThread2;

import java.util.Random;

public class Main {
        public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int[] arr = random.ints(1000, 0, 1000).toArray();
        // 1000 - размер потока, 0 - начиная с нуля включительно,
        // 1000 - заканчивая 1000 исключительно
        Thread coun1 = new MySumCount(3, 333, arr);
        Thread count = new MySumCount(6, 666, arr);
        count.start();
        coun1.start();
    }
}

