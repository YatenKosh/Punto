package javaSET.TestAnnotation;

public class Main {
    @Deprecated
    static void findMax(int... array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println(sum);
    }
    @SuppressWarnings("i")
    public static void main(String[] args) {
        int[] i = {3, 5, 7, 9, 13};
        findMax(i);    }
}

