package javaSET.TestLambda;

public interface MyConverter {
    void convertStr(String str);

    static void isNull(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("null");
        }
        System.out.println("All right");
    }
}
