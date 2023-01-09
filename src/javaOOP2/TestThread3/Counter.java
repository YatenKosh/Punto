package javaOOP2.TestThread3;

public class Counter extends Thread {

    private final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1_000_000; i++)
            synchronized (storage) {
                try {
                    storage.notifyAll();
                    storage.wait();
                    storage.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}

