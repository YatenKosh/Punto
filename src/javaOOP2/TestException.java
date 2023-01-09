package javaOOP2;

public class TestException {
    public static void main(String[] args) {
        try {
            Matrix mam = null;
            int[][] arr = {{3, 7, 11}, {2, 6, 12}};
            Matrix dad = new Matrix(arr);
            assert false;
            mam.equals(dad);
        } catch (Exception ex) {
            if (ex instanceof NullPointerException) {
                System.out.println("lol kek cheburek");
            } else
                System.out.println("Arihuet");

        } finally {
            System.out.println("final cum");
        }
    }
}