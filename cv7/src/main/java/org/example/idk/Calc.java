package org.example.idk;

import org.example.Main;

import java.util.logging.Logger;

public class Calc {
    private static final Logger LOG = Logger.getLogger(Calc.class.getName());
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(double a, double b) {
        assert b != 0;
        return a / b;
    }
}
