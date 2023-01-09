package javaOOP2;

public class Matrix {
    private int[][] array;
    public int a;
    public Matrix(int[][] array) {
        this.array = array;
    }
    public int[][] getArray() {
        return array;
    }
    public void setArray(int[][] array) {
        this.array = array;
    }
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        System.out.println("массив из рандомных чисел");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round((Math.random() * 19));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public String sumMatrix(int[][] array) {
        int sum = 0;
        for (int[] ints : array) for (int anInt : ints) sum += anInt;
        return "Сумма элементов матрицы: " + sum;
    }
    public String mulMatrix(int[][] array) {
        int mul = 1;
        for (int[] ints : array) for (int anInt : ints) mul *= anInt;
        return "Умножение элементов матрицы: " + mul;
    }
}