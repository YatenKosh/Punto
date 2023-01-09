package javaOOP2;

public class MyPyramid {
    public static int printPyramid(int h) {
        char g = ' ';
        for (int i = 1; i <= h; i++) {
            for (int l = 0; l <= (2 * h - 1) / 2 - i; l++)
                System.out.printf(g + "\t");

            for (int j = 1; j <= i; j++)
                System.out.printf(j + "\t");

            for (int k = i - 1; k >= 1; k--)
                System.out.printf(k + "\t");
            System.out.println();
        }
        return h;
    }

    public static void main(String[] args) {
        printPyramid(6);

    }
}
