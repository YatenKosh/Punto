package javaOOP2.TestGenerics3;
import java.util.Random;
public class MyMixer<T> {
    T[] t;
    public MyMixer(T[] t) {
        this.t = t;
    }
    //метод перемешивающий масив
    public void shuffle(T[] t) {
        Random rand = new Random();
        for (int i = t.length - 1; i >= 1; i--) {
            int j = rand.nextInt(i + 1);
            T tmp = t[j];
            t[j] = t[i];
            t[i] = tmp;
        }
    }
}