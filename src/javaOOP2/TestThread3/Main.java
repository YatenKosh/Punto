package javaOOP2.TestThread3;

public class Main {
    public static void main(String[] args) {
Storage storage = new Storage();
Counter counter = new Counter(storage);
Printer printer = new Printer(storage);
printer.setDaemon(true);
counter.start();
printer.start();
    }
}
