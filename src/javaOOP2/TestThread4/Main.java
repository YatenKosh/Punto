package javaOOP2.TestThread4;

public class Main {
    public static void main(String[] args) {
        //создает обьект динин хал
        DiningHall diningHall = new DiningHall();
       // создаем цикл что бы каждому выдали мейк пица
        for (int i = 0; i < 11; i++) {
            diningHall.makePizza();
        }
        //цикл на двацать студентов
        for (int i = 0; i < 21; i++) {
            new Student(diningHall).start();
        }
    }
}
