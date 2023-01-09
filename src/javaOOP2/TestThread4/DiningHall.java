package javaOOP2.TestThread4;
// сделайте так, чтобы после 10 вызовов метода makePizza()
//        метод servePizza() вызывался один раз
//        для каждого из 20 разных потоков.
public class DiningHall extends Thread {
    static int pizzaNum;
    static int studentID = 1;
    public DiningHall() {
    }
    public void makePizza() {
        pizzaNum++;
    }
    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--; //добавляем видимость потоков
        } else result = "Starved ";
        System.out.println(result + studentID + "\t"
                + Thread.currentThread().getName());
        studentID++;

    }
}
