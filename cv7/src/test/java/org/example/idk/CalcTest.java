package org.example.idk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest extends Calc {
    Calc calc = new Calc();

    @Test
    void testAdd() {
    }

    @Test
    void testSub() {
    }

    @Test
    void testMul() {
    }

    @Test
    void testDiv() {
        assertEquals(1, calc.div(1, 1), "Division with the same number in Calc function sub");
        assertEquals(25, calc.div(50, 2), "Classic division with number in Calc function sub");
        assertEquals(0.1, calc.div(1, 10), "Division so that return is decimal");
        assertEquals(0.1, calc.div(1, 10), "Division so that return is decimal");
    }
}