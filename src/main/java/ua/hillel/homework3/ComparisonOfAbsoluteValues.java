package ua.hillel.homework3;

import java.util.Scanner;

public class ComparisonOfAbsoluteValues {
    public static void main(String[] args) {
        System.out.println("Enter the first value");
        int value1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the second value");
        int value2 = new Scanner(System.in).nextInt();

        int max= Math.abs(value1)>Math.abs(value2)? value1 : value2;
        System.out.println("AbsoluteValue = " + max);
    }

}
