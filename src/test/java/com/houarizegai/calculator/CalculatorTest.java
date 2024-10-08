package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeAll;
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
    private static CalculatorUI calculatorUI;

    // So we don't have to repeatedly call `calculatorUI = new CalculatorUI()` everytime.
    @BeforeAll
    public static void setUp(){
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculatorUI.calculate(2,3,'+'));
        assertEquals(-5, calculatorUI.calculate(-2, -3, '+'));
        assertEquals(0, calculatorUI.calculate(0, 0, '+'));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-6, calculatorUI.calculate(2, 8, '-'));
    }

    @Test
    public void testMultiplication() {
        // Interfaced Base
        // calculate(a, b)
        // a is null
        // a is not null
        // b is null
        // b is not null

        // Functionality Based
        // calculate(a,b)
        // a > b
        // a < b
        // a == b
        int num = 0;
        int a =0 , b= 0;
//      assertEquals(null, calculatorUI.calculate(null, null, '*'));

    }

    @Test
    public void testDivision() {
        assertEquals(64, calculatorUI.calculate(320, 5, '/'));
    }

    @Test
    public void testSquareRoot() throws Exception {
        //Interfaced Based

        //Functionality Based

        // We want to run SqrtTest with the main calculatorTest, so we put a @EnabledIf to prevent it
        SqrtTest.enableTest();

        SqrtTest sqt = new SqrtTest();
        sqt.testSquareRootNull();
        sqt.testSquareRootNoInput();
        sqt.testSquareRootNotANumber();
        sqt.testSquareRootNegativeInput();
        sqt.testSquareRootZeroInput();
        sqt.testSquareRootPositiveInput();
    }

    @Test
    public void testPower() {
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
