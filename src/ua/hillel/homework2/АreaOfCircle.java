package ua.hillel.homework2;

import java.util.Scanner;

public class АreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга");
        double radius = new Scanner(System.in).nextDouble();
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Площадь круга = " + area);
    }
}
