package javaOOP2.TestGenerics2;
// найти количество чисел превышающие заданое число
public class MyTestMethod {
    public static <T extends Number> int calcNum(T[] array, T maxElem) {
        int count = 0;
        for (T t : array) {
            if (t.doubleValue() > maxElem.doubleValue()) count++;
        }
        return count;
    }
}
