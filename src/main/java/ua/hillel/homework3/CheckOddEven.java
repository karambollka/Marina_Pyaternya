package ua.hillel.homework3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        System.out.println("BYE");
    }
}

