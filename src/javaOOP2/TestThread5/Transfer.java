package javaOOP2.TestThread5;

public class Transfer extends Thread {
    private final Bank bank;
    private final int from;
    private final int max;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {
        synchronized (bank) {
            bank.transfer(from, (int) (bank.getNumberAccounts()
                    * Math.random()), (int) (max * Math.random()));
        }
    }
}