package javaOOP2.TestThread5;

public class Main {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;
    public static void main(String[] args) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        while (true) {
            new Transfer(bank, (int)(N_ACCOUNTS * Math.random()),INIT_BALANCE).start();
        }
    }
}