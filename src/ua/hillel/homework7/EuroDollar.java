package ua.hillel.homework7;

import java.util.Scanner;

public class EuroDollar extends Dollar {
    @Override

    public void getDollar() {
        super.getDollar();
        System.out.println("Enter grn");
        int grn = new Scanner(System.in).nextInt();
        double euro = grn * 39.555;
        System.out.println("Euro = " + euro);

    }
}

