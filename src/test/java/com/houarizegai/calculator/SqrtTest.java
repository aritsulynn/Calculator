package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.EnabledIf;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

// I made this class separately because there's setup needed to be done
// And Mockito (Mocking module)
// https://www.vogella.com/tutorials/Mockito/article.html
// https://stackoverflow.com/questions/38747779/mockito-what-is-it-and-how-is-it-different-from-junit
// For mocking UI unit testing

// What is reflection and private variable
/*
Java Reflection is a powerful feature in the Java programming language that allows developers to inspect and manipulate classes, methods, fields, and other components of the Java program at runtime. It provides the ability to perform operations such as:

- **Inspecting Class Metadata**: You can obtain information about a class's methods, fields, constructors, and annotations.
- **Dynamic Method Invocation**: You can call methods on objects dynamically, even if their names are not known at compile time.
- **Accessing Private Members**: You can access and modify private fields and methods of a class, bypassing standard access control checks.

### Accessing Private Variables in Another Class

To access a private variable in another class using reflection, follow these steps:

1. **Obtain the Class Object**: Use `Class.forName()` or `.getClass()` to get the class object of the target class.
2. **Get the Field**: Use the `getDeclaredField(String name)` method to retrieve the field you want to access.
3. **Set Accessibility**: Call `setAccessible(true)` on the field to bypass the private access modifier.
4. **Access or Modify the Field**: Use the `get(Object obj)` or `set(Object obj, Object value)` methods to access or modify the field.

### Example

Here’s an example of how to access a private variable from another class using reflection:

```
class MyClass {
    private String myPrivateVariable = "Hello, World!";
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Step 1: Get the Class object
            Class<?> myClass = MyClass.class;

            // Step 2: Get the private field
            Field field = myClass.getDeclaredField("myPrivateVariable");

            // Step 3: Make the field accessible
            field.setAccessible(true);

            // Step 4: Create an instance of MyClass
            MyClass myClassInstance = new MyClass();

            // Accessing the private variable
            String value = (String) field.get(myClassInstance);
            System.out.println("Private variable value: " + value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
```
 */

public class SqrtTest {
    private static CalculatorUI calculatorUI;
    private static boolean shouldRunTests = false;

    public static void enableTest(){
        shouldRunTests = true;
    }

    @BeforeAll
    public static void setup(){
        calculatorUI = new CalculatorUI();
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootPositiveInput() throws Exception {
        // Set input value
        calculatorUI.inputScreen.setText("9"); // Set the input to 9

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertEquals("3", calculatorUI.inputScreen.getText());
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootNegativeInput() throws Exception{
        // Set input value to a negative number
        calculatorUI.inputScreen.setText("-9"); // Set the input to -9

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertEquals("NaN", calculatorUI.inputScreen.getText());
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootZeroInput() throws Exception{
        // Set input value to a negative number
        calculatorUI.inputScreen.setText("0"); // Set the input to 0

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertEquals("0", calculatorUI.inputScreen.getText());
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootNotANumber() throws Exception{
        String inputText = "Hello World";
        calculatorUI.inputScreen.setText(inputText);

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertEquals(inputText, calculatorUI.inputScreen.getText());

        // The code doesn't have a logic to deal with anything non-numeral, so the result is just the input
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootNull() throws Exception{
        // Set input value to a negative number
        calculatorUI.inputScreen.setText(null); // Set the input to 0

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertNull(null, calculatorUI.inputScreen.getText());
    }

    @Test
    @EnabledIf("isTestEnabled")
    public void testSquareRootNoInput() throws Exception{
        // Set input value to a negative number
        calculatorUI.inputScreen.setText(""); // Set the input to 0

        // Use reflection to access the private btnRoot field
        Field btnRootField = CalculatorUI.class.getDeclaredField("btnRoot");
        btnRootField.setAccessible(true); // Make it accessible
        JButton btnRoot = (JButton) btnRootField.get(calculatorUI);

        // Retrieve the action listener from the button
        ActionListener[] listeners = btnRoot.getActionListeners();
        ActionListener btnRootListener = listeners[0];

        // Simulate button click
        btnRootListener.actionPerformed(null);

        // Check the result
        assertEquals("", calculatorUI.inputScreen.getText());
    }

    public static boolean isTestEnabled() {
        return shouldRunTests;
    }
}
