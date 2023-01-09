package javaOOP2.TestThread2;

public class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                sleep(1000);        //Приостанавливает поток на 1 секунду
            } catch (InterruptedException ignored) {
            }
            System.out.println("Первый поток");
        }
        //Слово «яйцо» сказано 5 раз
    }
}