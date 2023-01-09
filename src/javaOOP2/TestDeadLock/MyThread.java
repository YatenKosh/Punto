package javaOOP2.TestDeadLock;

public class MyThread extends Thread {
    public static final Object ob1 = new MyObject();
    public static final Object ob2 = new MyObject();
    public static final Object ob3 = new MyObject();

    @Override
    public void run() {
        synchronized (ob1) {
            System.out.println("thread 1 sleep, holding lock 1...");
            try {
                Thread.sleep(66);
            } catch (InterruptedException ignored) {
            }
            System.out.println("thread 1 sleep, holding lock 2...");
            synchronized (ob2) {
                System.out.println("thread 1 sleep, holding lock 1 & 2...");
            }
        }
        synchronized (ob3) {
            System.out.println("thread 2 sleep, holding lock 1...");
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    synchronized void last() {
        System.out.println("В методе MyThread.last()");
    }
}