package javaOOP2.TestGenerics1;

public class main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> tuple = new MyTuple<String, Integer, Long>(" ", 23, 4L);
        MyTuple<Double, String, String> tuple1 = new MyTuple<Double, String, String>(2.5, "kek", "45");
        System.out.println();
    }
}
