package javaOOP2.TestMyGenerator;


public class Main {
    public static void main(String[] args) {
        MyNumGenerator link = new MyNumGenerator(5, 64);
        System.out.println(link.generate());
        System.out.println(link.generateDistinct());
    }
}
