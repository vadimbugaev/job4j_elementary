package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int value = 2; value <= number - 1; value++) {
            if ((number % 1) == 0 && number % number == 0) {
                prime = true;
                break;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
