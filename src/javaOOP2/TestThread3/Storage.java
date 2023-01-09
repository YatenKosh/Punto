package javaOOP2.TestThread3;

import java.util.concurrent.atomic.AtomicInteger;

public class Storage {
    public final AtomicInteger count = new AtomicInteger();
    public void increment() {
        count.incrementAndGet();
    }
    public AtomicInteger getCount() {
        return count;
    }
}