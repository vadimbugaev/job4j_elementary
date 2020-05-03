package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeight() {
        double in = 100;
        double expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void thenWomanWeight() {
        double in2 = 110;
        double expected2 = 126.5;
        double out2 = Fit.manWeight(in2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}