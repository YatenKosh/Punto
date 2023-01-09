package javaOOP2.TestThread3;

public class Printer extends Thread {
    private final Storage storage;
    public Printer(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (storage) {
                try {
                    System.out.println(storage.getCount());
                    storage.notify();
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}