package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            if (n == 0) {
                result = 1;
            }
            result = result * index;
        }
        return result;
    }
}
