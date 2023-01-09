package javaOOP2;

public class MyInitTest {
    public static int n;
    public String call, voice, color;
    public MyInitTest(String call, String voice, String color) {
        this.call = call;
        this.voice = voice;
        this.color = color;
        n++;
    }
    public MyInitTest(int n) {
        this.n = n;
    }
    {
        call = "Suzy";
        voice = "quit";
        color = "yellow";
    }
    MyInitTest (int c, int f) { c = 1; f = 3;}
    public static void main(String[] args) {
    }
}
