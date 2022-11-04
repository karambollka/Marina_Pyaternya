package ua.hillel.homework2;

import java.util.Scanner;

public class DegreeConverter {
    public static void main(String[] args) {
        System.out.println("Введите градусы в Цельсиях:");
        double celsius = new Scanner(System.in).nextDouble();
        double fahrenheit = (celsius * 9 / 5)  + 32;
        double kelvin = celsius + 273.16;
        System.out.println( "градусы Цельсия в Фаренгейтах = "+ fahrenheit);
        System.out.println( "градусы Цельсия в Кельвинах = "+ kelvin);

    }
}
