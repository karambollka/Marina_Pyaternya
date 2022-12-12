package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / 20;
        System.out.println("Cредне арифметическое массива = " + average);
    }
}
