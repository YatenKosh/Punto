package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a14 {
    public static void main(String[] args) {
        MyBank myBank = new MyBank();
        for (int i = 0; i < 10; i++) {
            new MyThreadGive(myBank);
        }
        for (int i = 0; i < 10; i++) {
            new MyThreadTake(myBank);
        }
        System.out.println("Итоговая сумма на счету: " + myBank.getBalance());
    }
}