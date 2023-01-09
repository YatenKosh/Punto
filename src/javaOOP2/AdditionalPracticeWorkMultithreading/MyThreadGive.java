package javaOOP2.AdditionalPracticeWorkMultithreading;

public class MyThreadGive extends Thread {
    final private MyBank myBank;

    public MyThreadGive(MyBank myBank) {
        this.myBank = myBank;
    }

    @Override
    public void run() {
        synchronized (myBank) {
            myBank.give((int) (Math.random() * 50_000));
        }
    }
}