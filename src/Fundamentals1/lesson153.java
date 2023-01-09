package Fundamentals1;

public class lesson153 {
    //таблица умножения
    public static void main(String[] args) {
        System.out.println("1  2  3  4  5  6  7  8  9");
        System.out.println("---------------------------");
        int b = 2;
        while (b < 10) {
            System.out.print(b + " | ");
            int a = 2;
            while (a < 10) {
                int mul = b * a;
                if (mul < 10)
                    System.out.print(mul + "  ");
                else
                    System.out.print(mul + " ");
                a++;
            }
            System.out.println();
            b++;
        }
    }
}