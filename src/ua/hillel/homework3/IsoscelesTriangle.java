package ua.hillel.homework3;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the first side of the triangle");
        int value1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the second side of the triangle");
        int value2 = new Scanner(System.in).nextInt();

        System.out.println("Enter the third side of the triangle");
        int value3 = new Scanner(System.in).nextInt();

        String results= value1 == value3 && value2 == value3 ? "NO isosceles" : value1 == value2 || value1 == value3 || value2 == value3 ? "isosceles" :  "NO isosceles";
        System.out.println("triangle " + results);

    }
}
