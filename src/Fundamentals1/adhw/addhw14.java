package Fundamentals1.adhw;
import java.util.Arrays;

public class addhw14{
    public static void main(String[] args){
        int[] array = new int[10];
        int i=0;
        while(i<10){
            array[i] = i+1;
            i++;
        }
        System.out.println("input data : " + Arrays.toString(array));
        i = 0;
        int buff;
        while(i<10){
            buff = array[i+1];
            array[i+1] = array[i];
            array[i] = buff;
            i+=2;
        }
        System.out.println("final data : " + Arrays.toString(array));
    }
}