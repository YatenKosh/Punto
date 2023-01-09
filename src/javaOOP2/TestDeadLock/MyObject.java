package javaOOP2.TestDeadLock;

public class MyObject{
    synchronized void foo(MyThread b) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод MuObject.foo()");

        try {
            Thread.sleep(999);
        } catch (Exception e) {
            System.out.println("Класс MyObject прерван");
        }

        System.out.println(name + " пытается вызвать метод MyObject.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе FirstClass.last()");
    }
}
