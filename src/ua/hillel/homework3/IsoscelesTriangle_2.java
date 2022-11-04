package ua.hillel.homework3;

import java.util.Scanner;

public class IsoscelesTriangle_2 {
    public static void main(String[] args) {
        System.out.println("Enter the first side of the triangle");
        int value1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the second side of the triangle");
        int value2 = new Scanner(System.in).nextInt();

        System.out.println("Enter the third side of the triangle");
        int value3 = new Scanner(System.in).nextInt();

        if (value1 == value3 && value2 == value3){
            System.out.println("triangle NO isosceles");
        }
        else if (value1==value2 || value1==value3 || value2==value3){
            System.out.println("triangle isosceles");
        }
        else {
            System.out.println("triangle NO isosceles");
        }
    }
}
