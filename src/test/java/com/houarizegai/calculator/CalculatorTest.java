package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {
    private CalculatorUI calculatorUI;
    
    @Test
    public void testAddition() {
        calculatorUI = new CalculatorUI();
        assertEquals(3, calculatorUI.calculate(1,2,'+'));
        assertEquals(-3, calculatorUI.calculate(-2, -1, '+'));
        assertEquals(0, calculatorUI.calculate(-2, 2, '+'));
        assertEquals(2, calculatorUI.calculate(3, -1, '+'));
        assertEquals(-2, calculatorUI.calculate(-3, 1, '+'));
        assertEquals(1.1, calculatorUI.calculate(2.2, -1.1, '+'));
        assertEquals(-1.1, calculatorUI.calculate(-2.2, 1.1, '+'));
        assertEquals(0, calculatorUI.calculate(1.1, -1.1, '+'));
    }

    @Test
    public void testSubtraction() {
        calculatorUI = new CalculatorUI();
        assertEquals(-6, calculatorUI.calculate(2, 8, '-'));
    }

    @Test
    public void testMultiplication() {
        calculatorUI = new CalculatorUI();
        assertEquals(445, calculatorUI.calculate(44.5, 10, '*'));
    }

}
