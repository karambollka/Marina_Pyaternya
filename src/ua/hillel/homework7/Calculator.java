package ua.hillel.homework7;

import java.util.Scanner;

public class Calculator {
    // private static Scanner read;

    public static void main(String[] args) {

        double first = 0;
        double second = 0;
        String operator;

        System.out.println("Enter a number1");
        first = new Scanner(System.in).nextDouble();

        System.out.println("Enter an operator");
        operator = new Scanner(System.in).next();

        System.out.println("Enter a number2");
        second = new Scanner(System.in).nextDouble();

        if (operator.equals("+")) {
            Summa summa = new Summa();
            summa.summ(first, second);
        }
        if (operator.equals("/")) {
            Separation separation = new Separation();
            System.out.println("Result = " + separation.delenie(first, second));
        }
        if (operator.equals("*")) {
            Multiplication multiplication = new Multiplication();
            multiplication.mult(first, second);
        }

    }
}

