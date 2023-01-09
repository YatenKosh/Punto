package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a9 extends Thread {
    protected static final int THREADS = 20;
    public void run() {
        for (int i = 0;; ++i)
        System.out.println(getName() + " " + i);
            }

    public static void main(String[] args) {
        while (true) {
            new a9().start();
        }
    }
}