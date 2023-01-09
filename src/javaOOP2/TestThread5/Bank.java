package javaOOP2.TestThread5;

import java.util.Arrays;

public class Bank {
    private final int[] accounts;
    private final int numOfAccounts;

    public Bank(int num_accounts, int init_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        Arrays.fill(accounts, init_balance);
    }

    void transfer(int from, int to, int amount) {
        System.out.println("\tfrom: " + from + " to: " + to +
                "\t amount: " + amount);
        if (accounts[from] < amount) return;
        accounts[from] -= amount;
        try {
            Thread.sleep((int) (100 * Math.random()));
        } catch (InterruptedException ignored) {
        }
        accounts[to] = accounts[to] + amount;
        System.out.println("Total balance: " + totalBalance());
    }

    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total += v;
        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }
}