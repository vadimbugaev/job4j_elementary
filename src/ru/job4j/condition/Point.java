package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double operacia1 = x2 - x1;
        double operacia2 = y2 - y1;
        double operacia3 = operacia1 * 2;
        double operacia4 = operacia2 * 2;
        double operacia5 = operacia3 + operacia4;

        double rsl = Math.pow(operacia5, 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
