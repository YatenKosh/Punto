package javaOOP2.AdditionalPracticeWorkMultithreading;

public class a10 extends Thread {
    private a10 a;

    public void setA(a10 a) {
        this.a = a;
    }

    @Override
    public void run() {
        if (a != null) {
            System.out.println(getName() + " started " + a.getName());
            a.start();
        }
    }

    public static void main(String[] args) {
        a10 thread1 = new a10();
        a10 thread2 = new a10();
        a10 thread3 = new a10();
        a10 thread4 = new a10();
        a10 thread5 = new a10();
        a10 thread6 = new a10();
        a10 thread7 = new a10();
        a10 thread8 = new a10();
        a10 thread9 = new a10();
        a10 thread10 = new a10();
        a10 thread11 = new a10();
        a10 thread12 = new a10();
        a10 thread13 = new a10();
        a10 thread14 = new a10();
        a10 thread15 = new a10();
        a10 thread16 = new a10();
        a10 thread17 = new a10();
        a10 thread18 = new a10();
        a10 thread19 = new a10();
        a10 thread20 = new a10();
        thread1.setA(thread2);
        thread2.setA(thread3);
        thread3.setA(thread4);
        thread4.setA(thread5);
        thread5.setA(thread6);
        thread6.setA(thread7);
        thread7.setA(thread8);
        thread8.setA(thread9);
        thread9.setA(thread10);
        thread10.setA(thread11);
        thread11.setA(thread12);
        thread12.setA(thread13);
        thread13.setA(thread14);
        thread14.setA(thread15);
        thread15.setA(thread16);
        thread16.setA(thread17);
        thread17.setA(thread18);
        thread18.setA(thread19);
        thread19.setA(thread20);
        thread1.start();
    }
}
