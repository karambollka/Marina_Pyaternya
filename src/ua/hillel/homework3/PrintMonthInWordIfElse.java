package ua.hillel.homework3;
import java.util.Scanner;

public class PrintMonthInWordIfElse {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        int number = new Scanner(System.in).nextInt();
        if (number == 1) {
            System.out.println("JAN");
        }
        else if (number == 2) {
            System.out.println("FEB");
        }
        else if (number == 3) {
            System.out.println("MAR");
        }
        else if (number == 4) {
            System.out.println("APR");
        }
        else if (number == 5) {
            System.out.println("MAY");
        }
        else if (number == 6) {
            System.out.println("JUN");
        }
        else if (number == 7) {
            System.out.println("JUL");
        }
        else if (number == 8) {
            System.out.println("AUG");
        }
        else if (number == 9) {
            System.out.println("SEP");
        }
        else if (number == 10) {
            System.out.println("OCT");
        }
        else if (number == 11) {
            System.out.println("NOV");
        }
        else if (number == 12) {
            System.out.println("DEC");
        }
        else {
            System.out.println("Not a valid month");
        }
    }
}
