package javaOOP2.TestThread4;

public class Student extends Thread {
    private final DiningHall diningHall;
//создаем обьект в класе студент и делаем
// конструктор для него
    public Student(DiningHall diningHall) {
        this.diningHall = diningHall;
    }

    @Override
    public void run() {
      diningHall.servePizza();
    }
}
