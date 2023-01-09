package javaOOP2.AdditionalPracticeWorkMultithreading;

public class MyThreadTake extends Thread{
    final private MyBank myBank;

    public MyThreadTake(MyBank myBank) {
        this.myBank = myBank;
    }

    @Override
    public void run() {
        synchronized (myBank) {
            myBank.take((int) (Math.random() * 50_000));
        }
    }
}