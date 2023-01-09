package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread a = new Thread(new a2());
        a.start();
    }
}