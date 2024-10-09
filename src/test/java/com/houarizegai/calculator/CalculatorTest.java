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


    /*
     * Copyright (C) 2024 Purinat Pattanakeaw - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @BeforeAll
    public static void setUp(){
        // So we don't have to repeatedly call `calculatorUI = new CalculatorUI()` everytime.
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
         * C1: result is greater than 0, less than 0, equal to 0
         * t1 result is greater than 0
         * t2 result is less than 0
         * t3 result is 0
         */
        assertEquals(5, calculatorUI.calculate(2, -3, '-'));
        assertEquals(-5, calculatorUI.calculate(-2, 3, '-'));
        assertEquals(0, calculatorUI.calculate(0, 0, '-'));

        /*
         * Interface-Based Characteristics test cases: BCC (Base Choice Coverage)
         * a is first number, b is second number
         * C1: a is greater than 0, equal to 0, less than 0
         * C2: b is greater than 0, equal to 0, less than 0
         * Select base (greater than 0, greater than 0)
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

    /*
     * Copyright (C) 2024 Purinat Pattanakeaw - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @Test
    public void testMultiplication() {
        // Interfaced Base
        // a < 0
        // a > 0
        // a == 0

        // b < 0
        // b > 0
        // b == 0

        // Functionality Based
        // a > b
        // a < b
        // a == b

        /*
a < 0:

    a < 0 and b < 0 with a > b
    a < 0 and b < 0 with a < b
    a < 0 and b < 0 with a == b
    a < 0 and b > 0 with a > b
    a < 0 and b > 0 with a < b
    a < 0 and b > 0 with a == b
    a < 0 and b == 0 with a > b
    a < 0 and b == 0 with a < b
    a < 0 and b == 0 with a == b

a > 0:

    a > 0 and b < 0 with a > b
    a > 0 and b < 0 with a < b
    a > 0 and b < 0 with a == b
    a > 0 and b > 0 with a > b
    a > 0 and b > 0 with a < b
    a > 0 and b > 0 with a == b
    a > 0 and b == 0 with a > b
    a > 0 and b == 0 with a < b
    a > 0 and b == 0 with a == b

a == 0:

    a == 0 and b < 0 with a > b
    a == 0 and b < 0 with a < b
    a == 0 and b < 0 with a == b
    a == 0 and b > 0 with a > b
    a == 0 and b > 0 with a < b
    a == 0 and b > 0 with a == b
    a == 0 and b == 0 with a > b
    a == 0 and b == 0 with a < b
    a == 0 and b == 0 with a == b
    */

        char operand = '*';
        // a < 0
        double a = -4;
        /*
            a < 0 and b < 0 with a > b
            a < 0 and b < 0 with a < b
            a < 0 and b < 0 with a == b
         */
        assertEquals(40, calculatorUI.calculate(a, -10, operand));
        assertEquals(4, calculatorUI.calculate(a, -1, operand));
        assertEquals(16, calculatorUI.calculate(a, a, operand));
        /*
        a < 0 and b > 0 with a > b Impossible
        a < 0 and b > 0 with a < b
        a < 0 and b > 0 with a == b Impossible
         */
        assertEquals(-40, calculatorUI.calculate(a, 10, operand));
        /*
            a < 0 and b == 0 with a > b Impossible
            a < 0 and b == 0 with a < b
            a < 0 and b == 0 with a == b Impossible
         */
        assertEquals(-0.0, calculatorUI.calculate(a, 0, operand));

        // a > 0
        a = 5;
        /*
            a > 0 and b < 0 with a > b
            a > 0 and b < 0 with a < b Impossible
            a > 0 and b < 0 with a == b Impossible
         */
        assertEquals(-5, calculatorUI.calculate(a, -1, operand));
        /*
            a > 0 and b > 0 with a > b
            a > 0 and b > 0 with a < b
            a > 0 and b > 0 with a == b
         */
        assertEquals(20, calculatorUI.calculate(a, 4, operand));
        assertEquals(50, calculatorUI.calculate(a, 10, operand));
        assertEquals(25, calculatorUI.calculate(a, a, operand));
        /*
            a > 0 and b == 0 with a > b
            a > 0 and b == 0 with a < b Impossible
            a > 0 and b == 0 with a == b Impossible
         */
        assertEquals(0.0, calculatorUI.calculate(a, 0, operand));

        // a == 0
        a = 0.0;
        /*
            a == 0 and b < 0 with a > b
            a == 0 and b < 0 with a < b Impossible
            a == 0 and b < 0 with a == b Impossible
         */
        assertEquals(-0.0, calculatorUI.calculate(a, -1, operand));
        /*
            a == 0 and b > 0 with a > b Impossible
            a == 0 and b > 0 with a < b
            a == 0 and b > 0 with a == b Impossible
         */
        assertEquals(0.0, calculatorUI.calculate(a, 145, operand));
        /*
            a == 0 and b == 0 with a > b Impossible
            a == 0 and b == 0 with a < b Impossible
            a == 0 and b == 0 with a == b
         */
        assertEquals(0.0, calculatorUI.calculate(a, a, operand));

    }

    /*
     * Copyright (C) 2024 Pattaradnai Kaeodumkoeng - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @Test
    public void testDivision() {

//       Interface Base
//       calculate (a,b)
//       a is positive
//       a is negative
//       a is zero
//       b is positive
//       b is negative
//       b is zero

//       Functionality Base
//       Result is negative
//       Result is zero
//       Result is positive
//       Result is infinity
//       Result is -infinity
//       Result is NaN

        // Test dividing a is positive and b is positive
        assertEquals(2, calculatorUI.calculate(6, 3, '/'));

        // Test dividing decimal result
        assertEquals(2.5, calculatorUI.calculate(5, 2, '/'));

        // Test dividing a is positive and b is negative
        assertEquals(-2, calculatorUI.calculate(6, -3, '/'));

        // Test dividing b is positive and a is negative
        assertEquals(2, calculatorUI.calculate(-6, -3, '/'));

        // Test dividing zero (a=0)
        assertEquals(0, calculatorUI.calculate(0, 5, '/'));

        // Test dividing zero, result = infinity (a is positive and b is zero)
        assertEquals(Double.POSITIVE_INFINITY, calculatorUI.calculate(1, 0, '/'));

        // Test dividing zero, result = -infinity (a is negative and b is zero)
        assertEquals(Double.NEGATIVE_INFINITY, calculatorUI.calculate(-1, 0, '/'));

        // Test zero dividing zero = NaN
        assertEquals(Double.NaN, calculatorUI.calculate(0, 0, '/'));

    }


    /*
     * Copyright (C) 2024 Purinat Pattanakeaw - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @Test
    public void testSquareRoot() throws Exception {
        // Interfaced Based

        // Null Input null
        // Empty Input ""
        // Not a Number input "Hello World"
        // Negative Number Input "-81"
        // Zero Input "0"
        // Positive Number Input "49"

        // Functionality Based

        // Positive SQRT (3)
        // 0 SQRT (0)
        // Negative SQRT (NaN)

        // We want to run SqrtTest with the main calculatorTest, so we put a @EnabledIf to prevent it
        SqrtTest sqt = new SqrtTest();
        sqt.setup();
        SqrtTest.enableTest();

        sqt.testSquareRootZeroInput();
        sqt.testSquareRootNull();
        sqt.testSquareRootNoInput();
        sqt.testSquareRootNotANumber();
        sqt.testSquareRootNegativeInput();
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

        /*
         * Functionality-Based Characteristics test cases
         * C1: Button C is on the screen or not (True, False)
         * t1 have button C on the screen
         * t2 doesn't have button C on the screen
         */
        assertTrue(calculatorUI.btnC != null); // t1

        /*
         * Interface-Based Characteristics test cases: BCC (Base Choice Coverage)
         * C1: Button C is on the screen or not
         * C2: Value on the screen is NaN, equal to 0, greater than 0, less than 0
         * t1: Value on the screen is NaN
         * t2: Value on the screen is equal to 0
         * t3: Value on the screen is greater than 0
         * t4: Value on the screen is less than 0
         * t5: Button C is not on the screen
         */

        calculatorUI.inputScreen.setText("NaN");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("1");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("-1");
        calculatorUI.btnC.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());
        
        // remove button C
        calculatorUI.btnC = null;
        assertTrue(calculatorUI.btnC == null); // Functionality-Based t2
        
        calculatorUI.inputScreen.setText("NaN"); // Interface-Based t5
        if(calculatorUI.btnC != null) {
            calculatorUI.btnC.doClick();
            assertEquals("0", calculatorUI.inputScreen.getText());
        }
        assertEquals("NaN", calculatorUI.inputScreen.getText());
    }

    @Test
    public void testDecimal() {
//        a is the text showing on the screen

//        Interface Base
//        a is zero and addtoDisplay = true
//        a is positive integer and addtoDisplay = true
//        a is positive integer and addtoDisplay = true
//        a is positive decimal and addtoDisplay = true
//        a is negative decimal and addtoDisplay = true
//        a is not a number and addtoDisplay = true
//        a is not a number and addtoDisplay = false  ex: infinity, -infinity, NaN

//        Functionality Base
//        Result is 'a.' (No change)
//        Result is 'a' + '.' (Appending a decimal point)
//        If addtoDisplay = false, result is 0. and change addtoDisplay = true
//
//
//

        // Input 0
        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnPoint.doClick();
        assertEquals("0.", calculatorUI.inputScreen.getText());

        // Input is not a number
        calculatorUI.inputScreen.setText("0.");
        calculatorUI.btnPoint.doClick();
        assertEquals("0.", calculatorUI.inputScreen.getText());

        // Input positive integer
        calculatorUI.inputScreen.setText("5");
        calculatorUI.btnPoint.doClick();
        assertEquals("5.", calculatorUI.inputScreen.getText());

        // Input negative integer
        calculatorUI.inputScreen.setText("-3");
        calculatorUI.btnPoint.doClick();
        assertEquals("-3.", calculatorUI.inputScreen.getText());

        // Input positive decimal
        calculatorUI.inputScreen.setText("3.14");
        calculatorUI.btnPoint.doClick();
        assertEquals("3.14", calculatorUI.inputScreen.getText());

        // Input negative decimal
        calculatorUI.inputScreen.setText("-5.2");
        calculatorUI.btnPoint.doClick();
        assertEquals("-5.2", calculatorUI.inputScreen.getText());

        // Input is not a number
        calculatorUI.inputScreen.setText("Hello");
        calculatorUI.btnPoint.doClick();
        assertEquals("Hello.", calculatorUI.inputScreen.getText());

        // addToDisplay false when infinity, -infinity, NaN
        calculatorUI.addToDisplay = false; // Simulate that addToDisplay is false
        calculatorUI.btnPoint.doClick(); // Simulate clicking the decimal button
        assertEquals("0.", calculatorUI.inputScreen.getText()); // Check if inputScreen is set to "0."
        assertEquals(true, calculatorUI.addToDisplay); // Check if addToDisplay is now true

    }


    @Test
    public void testEquals() {
    }

}
