package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Addition Functionality (+) ฮิม @Hyme 
Subtraction Functionality (-) เป้ @Lynn 
Multiplication Functionality () บู้ @B 
Division Functionality (/) กาแฟ @Kafair 
Square Root Functionality (√) บู้ @B 
Power Functionality (pow) ฮิม @Hyme 
Natural Logarithm Functionality (ln) พัด @patchyy 
Modulo Functionality (%) พัด @patchyy 
Backspace Functionality (<-) บลู @หนูบลูเองง 
Clear Functionality (C) เป้ @Lynn 
Decimal Functionality (.) กาแฟ @Kafair 
Equals Functionality (=) บลู @หนูบลูเองง 
*/

public class CalculatorTest {
    private CalculatorUI calculatorUI;

    @Test
    public void testAddition() {
        calculatorUI = new CalculatorUI();
        assertEquals(5, calculatorUI.calculate(2,3,'+'));
        assertEquals(-5, calculatorUI.calculate(-2, -3, '+'));
        assertEquals(0, calculatorUI.calculate(0, 0, '+'));
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

    @Test
    public void testDivision() {
        calculatorUI = new CalculatorUI();
        assertEquals(64, calculatorUI.calculate(320, 5, '/'));
    }

    @Test
    public void testSquareRoot() {
    }

    @Test
    public void testPower() {
        calculatorUI = new CalculatorUI();
        assertEquals(8, calculatorUI.calculate(2,3,'^'));
        assertEquals(1, calculatorUI.calculate(2, 0, '^'));
        assertEquals(0, calculatorUI.calculate(0, 3, '^'));
        assertEquals(-0.125, calculatorUI.calculate(-2, -3, '^'));
        assertEquals(Double.POSITIVE_INFINITY, calculatorUI.calculate(0,-3,'^'));  
    }

    @Test
    public void testNaturalLogarithm() {
    }

    @Test
    public void testModulo() {
    }

    @Test
    public void testBackspace() {
    }

    @Test
    public void testClear() {
        calculatorUI = new CalculatorUI();
        calculatorUI.inputScreen.setText("1");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());


        calculatorUI.inputScreen.setText("-1");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("NaN");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());
    }

    @Test
    public void testDecimal() {
    }

    @Test
    public void testEquals() {
    }

}
