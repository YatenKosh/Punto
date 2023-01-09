package javaOOP2.TestThread1;

public class MyTimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Осталось: " +
                    ((i > 4) ? i + " секунд" : (i > 1) ? i
                            + " секунды" : (i == 1) ? i + " секунда"
                            : "менее секунды"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("B o o m !!!");
        System.exit(0);
    }
}