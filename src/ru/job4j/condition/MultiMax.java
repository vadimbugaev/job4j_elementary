package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int value1 = first >= second ? first : second;
        int value2 = value1 >= third ? value1 : third;
        int result = value2;
        return result;
    }
}
