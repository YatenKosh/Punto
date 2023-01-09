package javaOOP2;

public class InitTest {
    private final int id;
    private static int nextId = (int) (Math.random() * 1000);
    public InitTest() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
}