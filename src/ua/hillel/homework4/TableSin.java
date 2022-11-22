package ua.hillel.homework4;

public class TableSin {
    public static void main(String[] args) {
        System.out.println("Таблица синусов с шагом 10 градусов от 0 до 360:");

        for (double i = 0; i <= 360; i = i + 10) {
            double radian = Math.toRadians(i); // либо  (Math.PI*i)/180;
            double sin = Math.sin(radian);
            String result = String.format("%.6f", sin);
            System.out.println("sin(" + i + ") =  " + result);
        }
    }
}
