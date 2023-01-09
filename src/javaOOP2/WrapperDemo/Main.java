package javaOOP2.WrapperDemo;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = 129;
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");
        Integer x6 = Integer.parseInt("129");
        System.out.println(x1 == x2);
        System.out.println("вторая строка " + x1.equals(x4));
        System.out.println(x1 == x5);
        System.out.println("четвертая строка " + x2.equals(x4));
        System.out.println(x2 == x5);
        System.out.println("шестая строка " + x4.equals(x5));
        System.out.println(x3 == x6);
        System.out.println("восьмая строка " + x3.equals(x6));
        try {
            System.out.println(WrapperDemo2.compute(0,8, '*'));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Решение не верно");
        }

        assert x1==x6:"эти цифры не равны";
    }
}
