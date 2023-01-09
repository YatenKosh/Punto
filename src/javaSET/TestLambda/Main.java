package javaSET.TestLambda;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] cif = new Integer[9]; // масив типа интежер
        for (int i = 0; i < cif.length; i++) {
            cif[i] = (int) Math.round((Math.random() * 13));
            System.out.print(cif[i] + " ");
        } //заполнили случайными числами
        System.out.println("\n сортировка в порядке убывания:");
        int temp;
        for (int i = 0; i < cif.length; i++) {
            int j = i + 1;
            while (j < cif.length) {
                if (cif[i] < cif[j]) {
                    temp = cif[i];
                    cif[i] = cif[j];
                    cif[j] = temp;
                }
                j++;
            }
            System.out.print(cif[i] + " ");
        }
        // лямбда сортировка цифр
        Arrays.stream(cif)
                .sorted(Comparator.comparingInt(x -> x))
                .toArray(Integer[]::new);
        System.out.print(Arrays.toString(cif));

        String[] word = {"what", "the", "fuck", "is", "going", "on?"};
         System.out.println("\n" + Arrays.toString(word)); //лямбда сортировка букв
        Arrays.stream(word).sorted().forEach(System.out::println);

    }
}