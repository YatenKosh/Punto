package javaOOP2.TestThread2;

public class ChickenVoice {
    static EggVoice mAnotherOpinion;    //Побочный поток

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();    //Создание потока
        System.out.println("Спор начат...");
        mAnotherOpinion.start();            //Запуск потока

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);        //Приостанавливает поток на 1 секунду
            } catch (InterruptedException ignored) {
            }

            System.out.println("второй поток");
        }
        //Слово «курица» сказано 3 раз
        if (mAnotherOpinion.isAlive())    //Если оппонент еще не сказал последнее слово
        {
            try {
                mAnotherOpinion.join();    //Подождать пока оппонент закончит высказываться.
            } catch (InterruptedException ignored) {
            }
            System.out.println("последнее слово за первым потоком");
        } else    //если оппонент уже закончил высказываться
        {
            System.out.println("Второй поток был последним");
        }
        System.out.println("Спор закончен!");
    }
}