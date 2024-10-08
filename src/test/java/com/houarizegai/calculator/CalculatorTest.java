package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Copyright (C) 2024 Thanawat Jarusuthirug, Sirasit Puangpathanachai,
 *  Sarttra Prasongtichol, Pattaradnai Kaeodumkoeng, Pattaravit Suksri,
 *  Purinat Pattanakeaw - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the MIT license. 
 */
public class CalculatorTest {
    private static CalculatorUI calculatorUI;

    // So we don't have to repeatedly call `calculatorUI = new CalculatorUI()` everytime.
    @BeforeAll
    public static void setUp(){
        calculatorUI = new CalculatorUI();
    }

    /*
     * Copyright (C) 2024 Sirasit Puangpathanachai - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license. 
     */
    @Test
    public void testAddition() {
        assertEquals(5, calculatorUI.calculate(2,3,'+'));
        assertEquals(-5, calculatorUI.calculate(-2, -3, '+'));
        assertEquals(0, calculatorUI.calculate(0, 0, '+'));
    }


    /*
     * Copyright (C) 2024 Thanawat Jarusuthirug - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license. 
     */
    @Test
    public void testSubtraction() {

        /*
         * Functionality-Based Characteristics test cases
         * t1 result is positive
         * t2 result is negative
         * t3 result is zero
         */
        assertEquals(5, calculatorUI.calculate(2, -3, '-'));
        assertEquals(-5, calculatorUI.calculate(-2, 3, '-'));
        assertEquals(0, calculatorUI.calculate(0, 0, '-'));

        /*
         * Interface-Based Characteristics test cases: BCC (Base Choice Coverage)
         * a is first number, b is second number
         * base (a,b) are greater than 0
         * t1 a, b are greater than 0
         * t2 a is greater than 0, b is equal to 0
         * t3 a is greater than 0, b is less than 0
         * t4 a is equal to 0, b is greater than 0
         * t5 a is less than 0, b is greater than 0
         */
        assertEquals(0, calculatorUI.calculate(1, 1, '-')); // t1
        assertEquals(1, calculatorUI.calculate(1, 0, '-')); // t2
        assertEquals(2, calculatorUI.calculate(1, -1, '-')); // t3
        assertEquals(-1, calculatorUI.calculate(0, 1, '-')); // t4
        assertEquals(-2, calculatorUI.calculate(-1, 1, '-')); // t5
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

    /*
     * Copyright (C) 2024 Sirasit Puangpathanachai - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license. 
     */
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


    /*
     * Copyright (C) 2024 Thanawat Jarusuthirug - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license. 
     */
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

        calculatorUI.inputScreen.setText("");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("0");
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
