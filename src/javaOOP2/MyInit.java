package javaOOP2;

public class MyInit {
    public static void main(String[] args) {
       int[] arr = new int[10];
        System.out.println("массив из рандомных чисел");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 34);
            System.out.print(arr[i] + " ");
        }
    }
}