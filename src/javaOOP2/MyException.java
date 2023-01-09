package javaOOP2;

public class MyException extends TestException {
    String a;
    int b;

    public MyException(String a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setA(String a) {
        this.a = "Avada";
    }

    public void setB(int b) {
        this.b = 13;
    }

    public static void main(String[] args) {
        try {
            int c = Integer.bitCount(31);
            int d = Integer.parseInt("c", 4);
            System.out.println(c / d);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}