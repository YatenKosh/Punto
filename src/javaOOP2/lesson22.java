package javaOOP2;
public class lesson22 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{3,2,1}};
        Matrix arra = new Matrix(arr);
       System.out.println(arra.sumMatrix(arr));
        System.out.println(arra.mulMatrix(arr));
    }
}