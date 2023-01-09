package javaOOP2.WrapperDemo;

public class WrapperDemo2 {

    public static double compute(int a, int b, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = (int) (a + b);
                break;
            case '-':
                result = (int) (a - b);
                break;
            case '/':
                result = (int) (a/ b);
                break;
            case '*':
                result = (int) (a *b);
                break;
            default:
                System.out.println("Операция не распознана, повторите ввод");
        }
        return result;
    }

    public static void main(String[] args) {
        Byte b = 5;
        Integer i = 10;
        System.out.println(WrapperDemo2.compute(b, i, '+'));


    }


}
