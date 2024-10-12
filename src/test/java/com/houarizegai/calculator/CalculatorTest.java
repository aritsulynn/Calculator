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
    /*
    * Copyright (C) 2024 Pattaravit Suksri - All Rights Reserved
    * You may use, distribute and modify this code under the terms of the MIT license.
    */
    @Test  
    public void testNaturalLogarithm() {
    /* 
    PWC : Pair Wise Coverage
    Interface-based Testing 
    - Input type : Integer or Decimal
    
    Function-based Testing
    - Output type: Negative, Zero, Positive, Undefined

    Testcase 
    - 1.decimal input and negative output
    - 2.integer input and zero output
    - 3.Larg integer input with a positive output
    - 4.Decimal (e) input, Positive output
    - 5.Decimal (close to zero) and Negative output
    - 6.large decimal input and a positive output
    - 7.Medium integer input with a positive output
    - 8.small integer input (0) with an undefined output
    - 9.large decimal input and a positive output
    - 10.medium decimal input with a positive output

    I Use delta to allowing small precision differences
     */
    calculatorUI.inputScreen.setText("0.5");
    calculatorUI.btnLog.doClick();
    double expected1 = -0.693;
    double actual1 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected1, actual1, 0.001);

    calculatorUI.inputScreen.setText("1");
    calculatorUI.btnLog.doClick();
    double expected2 = 0.0;
    double actual2 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected2, actual2, 0.001);

    calculatorUI.inputScreen.setText("100");
    calculatorUI.btnLog.doClick();
    double expected3 = 4.605;
    double actual3 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected3, actual3, 0.001);


    calculatorUI.inputScreen.setText(Double.toString(Math.E));
    calculatorUI.btnLog.doClick();
    double expected4 = 1.0;
    double actual4 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected4, actual4, 0.001);

    calculatorUI.inputScreen.setText("0.0001");
    calculatorUI.btnLog.doClick();
    double expected5 = -9.210;
    double actual5 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected5, actual5, 0.001);

    calculatorUI.inputScreen.setText("1000000.5");
    calculatorUI.btnLog.doClick();
    double expected6 = 13.816;
    double actual6 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected6, actual6, 0.001);

    calculatorUI.inputScreen.setText("5");
    calculatorUI.btnLog.doClick();
    double expected7 = 1.609;
    double actual7 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected7, actual7, 0.001);

    calculatorUI.inputScreen.setText("0");
    calculatorUI.btnLog.doClick();
    String output = calculatorUI.inputScreen.getText().trim();
    assertTrue(output.equalsIgnoreCase("NaN") || output.equalsIgnoreCase("Error") || output.equalsIgnoreCase("-Infinity"));

    calculatorUI.inputScreen.setText("123.45");
    calculatorUI.btnLog.doClick();
    double expected9 = 4.816;
    double actual9 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected9, actual9, 0.001);

    calculatorUI.inputScreen.setText("3.14");
    calculatorUI.btnLog.doClick();
    double expected10 = 1.144;
    double actual10 = Double.parseDouble(calculatorUI.inputScreen.getText());
    assertEquals(expected10, actual10, 0.001);
    }
    
    /*
    * Copyright (C) 2024 Pattaravit Suksri - All Rights Reserved
    * You may use, distribute and modify this code under the terms of the MIT license.
    */
    @Test  
    public void testModulo() {
   /* 
   PWC : Pair Wise Coverage
   Interface based : 
    - 1.Positive dividend and positive divisor, larger divisor 
    - 2.Negative dividend and positive divisor, divisor larger
    - 3.Positive dividend and negative divisor, divisor larger
    - 4.Negative dividend and negative divisor, divisor larger
    */

   assertEquals(calculatorUI.calculate(3, 8, '%'), 3); //1

   assertEquals(calculatorUI.calculate(-3, 8, '%'), -3); //2

   assertEquals(calculatorUI.calculate(3, -8, '%'), 3); //3

   assertEquals(calculatorUI.calculate(-3, -8, '%'), -3); //4

    /* 
    Function-based:
    - 5.Dividend equal to divisor, positive values
    - 6.Dividend equal to divisor, negative values
    - 7.Dividend greater than divisor, both positive
    - 8.Dividend greater than divisor, both negative
    - 9.Dividend less than divisor, both negative
    - 10.Positive dividend and positive divisor, both even numbers
     */

   assertEquals(calculatorUI.calculate(4, 4, '%'), 0); //5

   double result = calculatorUI.calculate(-4, -4, '%'); 
   if (result == -0.0) {
       result = 0.0; 
   } // to catch problem from the output that expected 0.0 and actual output are -0.0 so actually -0.0 is equal to 0.0 
   assertEquals(0.0, result); //6

   assertEquals(calculatorUI.calculate(9, 4, '%'), 1); //7

   assertEquals(calculatorUI.calculate(-9, -4, '%'), -1); //8

   assertEquals(calculatorUI.calculate(-3, -7, '%'), -3); //9

   assertEquals(calculatorUI.calculate(10, 4, '%'), 2); //10
    }

    /*
    * Copyright (C) 2024 Sarttra Prasongtichol - All Rights Reserved
    * You may use, distribute and modify this code under the terms of the MIT license.
    */
    @Test
    public void testBackspace() {
        //Functionality-based test cases
        //t1 to check that "Back" button is on the screen
        assertTrue(calculatorUI.btnBack != null);

        //Interface based test: Multiple Base Coverage Criteria(MBCC)
        //
        //t1 ( True, Positive, 1-digit )
        calculatorUI.inputScreen.setText("6");
        calculatorUI.btnBack.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        //t2 ( True, Positive, Many digits )
        calculatorUI.inputScreen.setText("25");
        calculatorUI.btnBack.doClick();
        assertEquals("2", calculatorUI.inputScreen.getText());

        //t3 ( True, Negative, Many digits )
        calculatorUI.inputScreen.setText("-14");
        calculatorUI.btnBack.doClick();
        assertEquals("-1", calculatorUI.inputScreen.getText());

        //t4 ( True, Negative, 1-digit )
        calculatorUI.inputScreen.setText("-8");
        calculatorUI.btnBack.doClick();
        assertEquals("-", calculatorUI.inputScreen.getText());
        //
        //END of Interface based test

        //t2 to check that "Back" button is not on the screen
        calculatorUI.btnBack = null;
        assertTrue(calculatorUI.btnBack == null);
        //
        //END of Functionality based test

       
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
    /*
     * Copyright (C) 2024 Pattaradnai Kaeodumkoeng - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
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

    /*
    * Copyright (C) 2024 Sarttra Prasongtichol - All Rights Reserved
    * You may use, distribute and modify this code under the terms of the MIT license.
    */
    @Test
    public void testEquals() {
        //Functionality based test
        //t1 the result is greater than 0
        calculatorUI.typedValue = 8;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("6");
        calculatorUI.btnEqual.doClick();
        assertEquals("14", calculatorUI.inputScreen.getText());
        //t2 the result is equal to 0
        calculatorUI.typedValue = 5;
        calculatorUI.selectedOperator = '*';
        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnEqual.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());
        //t3 the result is less than 0
        calculatorUI.typedValue = 9;
        calculatorUI.selectedOperator = '*';
        calculatorUI.inputScreen.setText("-2");
        calculatorUI.btnEqual.doClick();
        assertEquals("-18", calculatorUI.inputScreen.getText());
        //t4 the result is Infinity
        calculatorUI.typedValue = 1;
        calculatorUI.selectedOperator = '/';
        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnEqual.doClick();
        assertEquals("Infinity", calculatorUI.inputScreen.getText());
        //t5 the result is -Infinity
        calculatorUI.typedValue = -6;
        calculatorUI.selectedOperator = '/';
        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnEqual.doClick();
        assertEquals("-Infinity", calculatorUI.inputScreen.getText());
        //t6 the result is NaN
        calculatorUI.typedValue = 0;
        calculatorUI.selectedOperator = '/';
        calculatorUI.inputScreen.setText("0");
        calculatorUI.btnEqual.doClick();
        assertEquals("NaN", calculatorUI.inputScreen.getText());
        //
        //END Functionality based test case

        //Interface based test: Multiple Base Coverage Criteria(MBCC)
        //Selected 2 Base: ( a > 0 , b > 0 , + ) , ( a > 0 , b < 0 , +)
        //t1 ( a > 0, b > 0, + )
        calculatorUI.typedValue = 5;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("3");
        calculatorUI.btnEqual.doClick();
        assertEquals("8", calculatorUI.inputScreen.getText()); // 5 + 3 = 8

        //t2 ( a > 0, b > 0, - )
        calculatorUI.typedValue = 7;
        calculatorUI.selectedOperator = '-';
        calculatorUI.inputScreen.setText("2");
        calculatorUI.btnEqual.doClick();
        assertEquals("5", calculatorUI.inputScreen.getText()); // 7 - 2 = 5

        //t3 ( a > 0, b > 0, * )
        calculatorUI.typedValue = 2;
        calculatorUI.selectedOperator = '*';
        calculatorUI.inputScreen.setText("6");
        calculatorUI.btnEqual.doClick();
        assertEquals("12", calculatorUI.inputScreen.getText()); // 2 * 6 = 12
        //t4 ( a > 0, b > 0, / )
        calculatorUI.typedValue = 18;
        calculatorUI.selectedOperator = '/';
        calculatorUI.inputScreen.setText("3");
        calculatorUI.btnEqual.doClick();
        assertEquals("6", calculatorUI.inputScreen.getText()); // 18 / 3 = 6

        //t5  ( a > 0, b > 0, ^ )
        calculatorUI.typedValue = 4;
        calculatorUI.selectedOperator = '^';
        calculatorUI.inputScreen.setText("3");
        calculatorUI.btnEqual.doClick();
        assertEquals("64", calculatorUI.inputScreen.getText()); // 4 ^ 3  = 64
        //t6 ( a > 0, b > 0, %  )
        calculatorUI.typedValue = 100;
        calculatorUI.selectedOperator = '%';
        calculatorUI.inputScreen.setText("10");
        calculatorUI.btnEqual.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText()); // 100 % 10 = 10
        //t7 ( a < 0, b > 0, + )
        calculatorUI.typedValue = -8;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("10");
        calculatorUI.btnEqual.doClick();
        assertEquals("2", calculatorUI.inputScreen.getText()); // -8 + 10 = 2
        //t8 ( a > 0, b < 0, + )
        calculatorUI.typedValue = 14;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("-16");
        calculatorUI.btnEqual.doClick();
        assertEquals("-2", calculatorUI.inputScreen.getText()); // 14 + (-16) = -2
        //t9 ( a > 0, b < 0, - )
        calculatorUI.typedValue = 9;
        calculatorUI.selectedOperator = '-';
        calculatorUI.inputScreen.setText("-2");
        calculatorUI.btnEqual.doClick();
        assertEquals("11", calculatorUI.inputScreen.getText()); // 9 - (-2) = 11
        //t10 ( a > 0, b < 0, * )
        calculatorUI.typedValue = 5;
        calculatorUI.selectedOperator = '*';
        calculatorUI.inputScreen.setText("-7");
        calculatorUI.btnEqual.doClick();
        assertEquals("-35", calculatorUI.inputScreen.getText()); // 5*(-7) = -35
        //t11 ( a > 0, b < 0, / )
        calculatorUI.typedValue = 27;
        calculatorUI.selectedOperator = '/';
        calculatorUI.inputScreen.setText("-9");
        calculatorUI.btnEqual.doClick();
        assertEquals("-3", calculatorUI.inputScreen.getText()); // 27 /(-9) = -3
        //t12 ( a > 0, b < 0, ^ )
        calculatorUI.typedValue = 7;
        calculatorUI.selectedOperator = '^';
        calculatorUI.inputScreen.setText("-2");
        calculatorUI.btnEqual.doClick();
        assertEquals("0.02040816326530612", calculatorUI.inputScreen.getText()); // 7 ^ (-2) = 0.02040816326530612
        //t13 ( a < 0, b < 0, + )
        calculatorUI.typedValue = -2;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("-1");
        calculatorUI.btnEqual.doClick();
        assertEquals("-3", calculatorUI.inputScreen.getText()); // -2 + (-1) = 3
        //t14 ( a = 0, b < 0, + )
        calculatorUI.typedValue = 0;
        calculatorUI.selectedOperator = '+';
        calculatorUI.inputScreen.setText("-4");
        calculatorUI.btnEqual.doClick();
        assertEquals("-4", calculatorUI.inputScreen.getText()); // 0+ (-4) = -4
        //
        //END Interface based test case

    }

}
