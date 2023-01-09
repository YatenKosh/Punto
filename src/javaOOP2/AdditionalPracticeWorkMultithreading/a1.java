package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a1 extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        a1 thread = new a1();
        thread.start();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        };
        thread1.start();
    }
}