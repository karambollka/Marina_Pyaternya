package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfEvenNumbers {
    public static void main(String[] args) {
        int [] array = new int[15];
        Random random = new Random();

        for ( int i = 0; i < array.length; i ++) {
            array [i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for ( int i = 0; i < array.length; i ++) {
            if(array[i]%2==0){
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
