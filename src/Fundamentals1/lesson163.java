package Fundamentals1;

public class lesson163 {
    //написать матрицу 4 на 4
    public static void main(String[] args) {

        int[][] arr = new int[4][];
        arr[0] = new int[]{1, 5, 9, 13};
        arr[1] = new int[]{2, 6, 10, 14};
        arr[2] = new int[]{3, 7, 11, 15};
        arr[3] = new int[]{4, 8, 12, 16};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr.length * i + j;
            }
        }
        // часть 2 - выводим на экран начальную матрицу
        System.out.println("Начальная матрица");
        System.out.println("----------------");
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d", ints[j]);
            }
            System.out.println();
        }
        // часть 3 - транспонирование матрицы
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // часть 4 - выводит на экран транспонированную матрицу
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("~~~~~~~~~~~");
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }
}

