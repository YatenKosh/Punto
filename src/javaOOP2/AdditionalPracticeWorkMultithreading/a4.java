package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a4 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=10_000; i++) {
            System.out.print(i);
        }
        System.out.println("\n" + getName());
    }

    public static void main(String[] args) {
        a4 thread = new a4();
        thread.start();
    }
}