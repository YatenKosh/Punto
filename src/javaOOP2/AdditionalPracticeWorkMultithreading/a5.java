package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a5 extends Thread {
    boolean isDaemon;

    @Override
    public void run() {
        int counter = 0;

        while (true) {
            System.out.println("workers " + counter++);
            try {
                sleep(666);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        a5 t = new a5();
        t.setDaemon(true);
        t.start();
        System.out.println("daemon is " + t.isDaemon());
        try {
            Thread.sleep(999);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finish");
    }
}