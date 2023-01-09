package javaOOP2.AdditionalPracticeWorkMultithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MyBank {
    private final AtomicInteger account1 = new AtomicInteger(1_000_000);

    public void take(int value) {
        account1.addAndGet(-value);
    }

    public void give(int value) {
        account1.addAndGet(value);
    }

    int getBalance() {
        return account1.get();
    }
}
