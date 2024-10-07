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
        assertEquals(8, calculatorUI.calculate(3, 5, '+'));
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
