# To EsanLamSing

1. เริ่มทำครั้งแรกใช้ `git clone https://github.com/aritsulynn/Calculator.git` แทนของ original

2. ครั้งต่อๆไป ก่อนเริ่มทำให้คลิกขวาที่ชื่อ `project > git > pull` มันจะได้ update project เป็นเวอร์ชั่นล่าสุด

# Calculator

A very basic calculator application created using Java **Swing**.

[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## Thank You!

Please ⭐️ this repo and share it with others

## Screenshots

|                       Scientific / Dark                        | Standard / Colored                                               |
| :------------------------------------------------------------: | :--------------------------------------------------------------- |
| ![Dark calculator screenshot](screenshots/scientific-dark.png) | ![Colored calculator screenshot](screenshots/standard-light.png) |

## Requirements 🔧

- Java 11 or higher.

## Installation 🔌

1. Press the **Fork** button (top right the page) to save copy of this project on your account.

2. Download the repository files (project) from the download section or clone this project by typing in the bash the following command:

   git clone https://github.com/HouariZegai/Calculator.git

3. Imported it in Intellij IDEA or any other Java IDE.
4. Run the application :D

## Contributing 💡

If you want to contribute to this project and make it better with new ideas, your pull request is very welcomed.
If you find any issue just put it in the repository issue section, thank you.

# Test Suite

## ➕testAddition()

### Goal of the test case:

To test the addition operation in the calculator by verifying that it correctly handles the addition of two numbers.

### Input Domain Modelling:

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**:
    - **Non-Numeric Input**: If any input is non-numeric (like a string or special character), it should throw an error.
    - **Fraction Input**: If fractions like `1/2` are entered, the system should reject it and throw an error since fractions are not supported (but decimals like `0.5` are).

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | **b3**      |
      | ---------------------------- | -------------- | ---------- | ----------- |
      | C1 = _value of firstNumber_  | greater than 0 | equal to 0 | less than 0 |
      | C2 = _value of secondNumber_ | greater than 0 | equal to 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1**         | **b2**     | **b3**      |
      | -------------------------------- | -------------- | ---------- | ----------- |
      | C1 = _result of the calculation_ | greater than 0 | equal to 0 | less than 0 |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1** | **b2** | **b3** |
      | ---------------------------- | ------ | ------ | ------ |
      | C1 = _value of firstNumber_  | 2      | 0      | -2     |
      | C2 = _value of secondNumber_ | 3      | 0      | -3     |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1** | **b2** | **b3** |
      | -------------------------------- | ------ | ------ | ------ |
      | C1 = _result of the calculation_ | 5      | 0      | -5     |

- **Combine partitions to define test requirements**:

  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (number of largest characteristic) = 3

- **Derive test values and expected values**:
  `Each Choice Coverage (ECC)`
  | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
  |--------------------|---|---|---|
  | T1 (>0, >0) | 2 | 3 | 5 |
  | T2 (0, 0) | 0 | 0 | 0 |
  | T3 (<0, <0) | -2 | -3 | -5 |

## ➖ testSubtraction()

### Goal of test case:

To test the subtraction functionality of the calculator to ensure it correctly subtracts two numbers.

### Input Domain Modelling

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**:
    - **Non-Numeric Input**: If any input is non-numeric (like a string or special character), it should throw an error.
    - **Fraction Input**: If fractions like `1/2` are entered, the system should reject it and throw an error since fractions are not supported (but decimals like `0.5` are).

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | **b3**      |
      | ---------------------------- | -------------- | ---------- | ----------- |
      | C1 = _value of firstNumber_  | greater than 0 | equal to 0 | less than 0 |
      | C2 = _value of secondNumber_ | greater than 0 | equal to 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1**         | **b2**     | **b3**      |
      | -------------------------------- | -------------- | ---------- | ----------- |
      | C1 = _result of the calculation_ | greater than 0 | equal to 0 | less than 0 |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1** | **b2** | **b3** |
      | ---------------------------- | ------ | ------ | ------ |
      | C1 = _value of firstNumber_  | 2      | 0      | -2     |
      | C2 = _value of secondNumber_ | 3      | 0      | -3     |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1** | **b2** | **b3** |
      | -------------------------------- | ------ | ------ | ------ |
      | C1 = _result of the calculation_ | 5      | 0      | -5     |

- **Combine partitions to define test requirements**:

  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
  `Base Choice Coverage (BCC)` select (greater than 0, greater than 0) for base
  | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
  |--------------------|---|---|---|
  | T1 (>0, >0) | 1 | 1 | 0 |
  | T2 (>0, 0) | 1 | 0 | 1 |
  | T3 (>0, <0) | 1 | -1 | 2 |
  | T3 (0, >0) | 0 | 1 | -1 |
  | T3 (<0, >0) | -1 | 1 | -2 |

## ✖️ testMultiplication()

### Goal of the test case:

To test the multiplication operation in the calculator by verifying that it correctly handles the multiplication of two numbers across various conditions.

### Input Domain Modelling:

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**:
    - **Non-Numeric Input**: If any input is non-numeric, it should throw an error.

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | **b3**      |
      | ---------------------------- | -------------- | ---------- | ----------- |
      | C1 = _value of firstNumber_  | greater than 0 | equal to 0 | less than 0 |
      | C2 = _value of secondNumber_ | greater than 0 | equal to 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**                    | **b1**                       | **b2**                        | **b3**                       |
      | ------------------------------------- | ---------------------------- | ----------------------------- | ---------------------------- |
      | C1 = _comparison of first and second_ | `firstNumber > secondNumber` | `firstNumber == secondNumber` | `firstNumber < secondNumber` |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1** | **b2** | **b3** |
      | ---------------------------- | ------ | ------ | ------ |
      | C1 = _value of firstNumber_  | 5      | 0      | -4     |
      | C2 = _value of secondNumber_ | 10     | 0      | -10    |

    - **Functionality-Based Characteristics**:

      | **Characteristic**                                | **b1**                       | **b2**                        | **b3**                       |
      | ------------------------------------------------- | ---------------------------- | ----------------------------- | ---------------------------- |
      | C1 = _comparison of firstNumber and secondNumber_ | `firstNumber > secondNumber` | `firstNumber == secondNumber` | `firstNumber < secondNumber` |

- **Combine partitions to define test requirements**:

  - **Assumption**: Choose one value from each block
  - **Test requirements**: Number of tests (largest characteristic) = 3

- **Derive test values and expected values**:
  using `ACoC` Technique:
  | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
  |------------------------------|----------------|-----------------|---------------------|
  | T1 (a < 0, b < 0, a > b) | -4 | -10 | 40 |
  | T2 (a < 0, b < 0, a < b) | -4 | -1 | 4 |
  | T3 (a < 0, b < 0, a == b) | -4 | -4 | 16 |
  | T4 (a < 0, b > 0, a < b) | -4 | 10 | -40 |
  | T5 (a < 0, b == 0, a < b) | -4 | 0 | -0.0 |
  | T6 (a > 0, b < 0, a > b) | 5 | -1 | -5 |
  | T7 (a > 0, b > 0, a > b) | 5 | 4 | 20 |
  | T8 (a > 0, b > 0, a < b) | 5 | 10 | 50 |
  | T9 (a > 0, b > 0, a == b) | 5 | 5 | 25 |
  | T8 (a > 0, b == 0, a > b) | 5 | 0 | 0.0 |
  | T9 (a == 0, b < 0, a > b) | 0 | -1 | -0.0 |
  | T10 (a == 0, b > 0, a < b) | 0 | 145 | 0.0 |
  | T11 (a == 0, b == 0, a == b) | 0 | 0 | 0.0

## ➗ testDivision()

### Goal of test case:

To test the division functionality of the calculator to ensure it correctly divides two numbers.

### Input Domain Modelling

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**: If 1 divided by 0 will get “infinity”, if -1 divided by 0 will get -infinity and if 0/0 will get “NaN”
    - **Non-Numeric Input**: If any input is non-numeric (like a string or special character), it should throw an error.
    - **Fraction Input**: If fractions like `1/2` are entered, the system should reject it and throw an error since fractions are not supported (but decimals like `0.5` are).

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | **b3**      |
      | ---------------------------- | -------------- | ---------- | ----------- |
      | C1 = _value of firstNumber_  | greater than 0 | equal to 0 | less than 0 |
      | C2 = _value of secondNumber_ | greater than 0 | equal to 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1**         | **b2**     | **b3**      | **b4**   | **b5**    | **b6** |
      | -------------------------------- | -------------- | ---------- | ----------- | -------- | --------- | ------ |
      | C1 = _result of the calculation_ | greater than 0 | equal to 0 | less than 0 | infinity | -infinity | NaN    |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1** | **b2** | **b3** |
      | ---------------------------- | ------ | ------ | ------ |
      | C1 = _value of firstNumber_  | 2      | 0      | -2     |
      | C2 = _value of secondNumber_ | 3      | 0      | -3     |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1** | **b2** | **b3** | **b4**   | **b5**    | **b6** |
      | -------------------------------- | ------ | ------ | ------ | -------- | --------- | ------ |
      | C1 = _result of the calculation_ | 5      | 0      | -5     | infinity | -infinity | NaN    |


## 💪 testPower()

### Goal of the test case:

To test the power operation in the calculator by verifying that it correctly handles the base number (firstNumber) raised to the power of exponent (secondNumber).

### Input Domain Modelling:

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**:
    - **Non-Numeric Input**: If any input is non-numeric, an error should be thrown.
    - **Fraction Input**: If fractions like `1/2` are entered, the system will reject it and throw an error since fractions are not supported. Decimal equivalents (like `0.5`) are allowed.
    - **Zero Raised to Negative Power**: If `firstNumber` is `0` and `secondNumber` is negative, the result will be infinity.

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | **b3**      |
      | ---------------------------- | -------------- | ---------- | ----------- |
      | C1 = _value of firstNumber_  | greater than 0 | equal to 0 | less than 0 |
      | C2 = _value of secondNumber_ | greater than 0 | equal to 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1**         | **b2**     | **b3**     | **b4**      | **b5**   |
      | -------------------------------- | -------------- | ---------- | ---------- | ----------- | -------- |
      | C1 = _result of the calculation_ | greater than 1 | equal to 1 | equal to 0 | less than 0 | infinity |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1** | **b2** | **b3** |
      | ---------------------------- | ------ | ------ | ------ |
      | C1 = _value of firstNumber_  | 2      | 0      | -2     |
      | C2 = _value of secondNumber_ | 3      | 0      | -3     |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1** | **b2** | **b3** | **b4** | **b5**    |
      | -------------------------------- | ------ | ------ | ------ | ------ | --------- |
      | C1 = _result of the calculation_ | 8      | 1      | 0      | -0.125 | infiinity |

- **Combine partitions to define test requirements**:

  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
  `Each Choice Coverage (ECC)`
  | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
  |--------------------|---|---|---|
  | T1 (>0, >0) | 2 | 3 | 8 |
  | T2 (>0, 0) | 2 | 0 | 1 |
  | T3 (0, >0) | 0 | 3 | 0 |
  | T4 (<0, <0) | -2 | -3 | -0.125 |
  | T5 (0, <0) | 0 | -3 | infinity |

## ➖ testSquareRoot()

### Goal of test case:

To test the square root functionality of the calculator to ensure it correctly calculates the square root of various inputs.

### Input Domain Modelling

- **Identify Testable Functions**:

  - `calculateSquareRoot()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `inputNumber`
  - **Return Type**: `double`
  - **Return Value**: Result of the square root calculation
  - **Exceptional Behavior**:
    - **Non-Numeric Input**: If the input is non-numeric (like a string or special character), it should return the same string or throw an error.
    - **Negative Input**: If the input is a negative number, it should return `NaN` as square roots of negative numbers are undefined in the real number system.
    - **Empty Input**: If the input is an empty string, it should return "".

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**          | **b1**         | **b2** | **b3**        |
      | --------------------------- | -------------- | ------ | ------------- |
      | C1 = _value of inputNumber_ | valid positive | zero   | invalid input |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**          | **b1** | **b2** | **b3**        |
      | --------------------------- | ------ | ------ | ------------- |
      | C1 = _value of inputNumber_ | 49     | 0      | "Hello World" |

- **Combine partitions to define test requirements**:

  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
  `ACoC` Technique

  | **Test**            | **inputNumber** | **Expected result** |
  | ------------------- | --------------- | ------------------- |
  | T1 (valid positive) | "49"            | 7                   |
  | T2 (zero input)     | "0"             | 0                   |
  | T3 (null input)     | null            | null                |
  | T4 (empty input)    | ""              | ""                  |
  | T5 (invalid input)  | "Hello World"   | "Hello World"       |
  | T6 (negative input) | "-81"           | NaN                 |


## testNaturalLogarithm()

### Goal of test case:

To test that the calculator correctly compute the natural logarithm (ln) of a given .

### Input Domain Modelling

- **Identify Testable Functions**:

  - ``

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: ``

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**          | **b1**         | **b2** | **b3**        |
      | --------------------------- | -------------- | ------ | ------------- |
      | C1 = _value of inputNumber_ | valid positive | zero   | invalid input |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**          | **b1** | **b2** | **b3**        |
      | --------------------------- | ------ | ------ | ------------- |
      | C1 = _value of inputNumber_ | 49     | 0      | "Hello World" |

- **Combine partitions to define test requirements**:

  - **Test requirements**: number

- **Derive test values and expected values**:
  `PWC` Technique

  | **Test**            | **inputNumber** | **Expected result** |
  | ------------------- | --------------- | ------------------- |
  | T1 (valid positive) | "49"            | 7                   |

## ⬅️ testBackSpace()

### Goal of the test case:

To delete unnessecary number on the screen to fix the value of number.

### Input Domain Modelling:

- **Identify Testable Functions**:

  - `btnBack.doClick()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `Number(String)`,
  - **Return Type**: `String`
  - **Return Value**: `New Number`
  - **Exceptional Behavior**:None

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**               | **b1**         | **b2**     |
      | -------------------------------- | -------------- | ---------- |
      | _C1 = the initial value of number_         |   Positive | Negative |
      | _C2 = the Digit of number_         |   1- digit | Many Digits  |

    - **Functionality-Based Characteristics**:

      | **Characteristic**           | **b1**         | **b2**     | 
      | ---------------------------- | -------------- | ---------- | 
      | _C1 = Button on the screen is visible_   | True | False |


  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:
      | **Characteristic**           | **b1** | **b2** |
      | ---------------------------- | ------ | ------ | 
      | _C1 = the value of number_  | 2      | -2     |
      |_C2 = the Digit of number_ | 3      | 25      |

    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1** | **b2** | 
      | -------------------------------- | ------ | ------ |
      | _C1 = Button on the screen is visible_   | True | False |


- **Combine partitions to define test requirements**:

  - **Test requirements**: **2 base used** => 2 + ( 2 * (2 - 1) ) + ( 2 * (2 - 2) ) + ( 2 * (2 - 2) ) = **4 test cases**

- **Derive test values and expected values**:
    - Merge **Functionality-Based Characteristics** and **Interface-Based Characteristics** for test cases

    - **Multiple Base Coverage Criteria (MBCC):**
        **Selected Base:** ( True, Positive, 1-digit ), ( True, Negative, Many Digits )
     
  | **Test** | **InputNumber** | **Expected result** |
  |----------|-----------------|---------------------|
  | T1 ( True, Positive, 1-digit )   | 6 | 0 |
  | T2 ( True, Positive, Many digits ) | 25 | 2 |
  | T3 ( True, Negative, Many digits ) | -14 | -1 |
  | T4 ( True, Negative, 1-digit ) | -8 | - |


## 🧹 testClear()

### Goal of test case:

To ensure that the clear button correctly resets all relevant fields.

### Input Domain Modelling

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: Value on the screen
  - **Return Type**: `double`
  - **Return Value**: 0
  - **Exceptional Behavior**: None

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**         | **b1** | **b2**     | **b3**         | **b4**      |
      | -------------------------- | ------ | ---------- | -------------- | ----------- |
      | C1 = _value on the screen_ | NaN    | equal to 0 | greater than 0 | less than 0 |

    - **Functionality-Based Characteristics**:

      | **Characteristic**        | **b1** | **b2** |
      | ------------------------- | ------ | ------ |
      | C1 = _Is Button visible _ | True   | False  |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

      | **Characteristic**         | **b1** | **b2** | **b3** | **b4** |
      | -------------------------- | ------ | ------ | ------ | ------ |
      | C1 = _value on the screen_ | NaN    | 0      | 1      | -1     |

    - **Functionality-Based Characteristics**:

      | **Characteristic**       | **b1** | **b2** |
      | ------------------------ | ------ | ------ |
      | C1 = _Is Button visible_ | True   | False  |

- **Combine partitions to define test requirements**:

  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
  - Merge **Functionality-Based Characteristics** and **Interface-Based Characteristics** for test cases
    | **Characteristic** | **b1** | **b2** | **b3** | **b4** |
    |------------------------------|----------------------|--------------------|--------------------|--------------------|
    | C1 = _Is Button visible_ | True | False | | |
    | C2 = _value on the screen_ | NaN | equal to 0 | greater than 0 | less than 0 |
    
  - `Base Choice Coverage (BCC)` select (True, NaN) for base
    
    | **Test** | **Value on Screen** | **Expected result** |
    |--------------------|---------------------|---------------------|
    | T1 (True, NaN) | NaN | 0 |
    | T2 (True, NaN) | 0 | 0 |
    | T3 (True, NaN) | 1 | 0 |
    | T4 (True, NaN) | -1 | 0 |
    | T5 (False, NaN) | NaN | NaN |

## 🗽⃢⃢🗿 ദ്ദി ˉ͈̀꒳ˉ͈́ )✧ testDecimal()

### Goal of test case:

To test the decimal functionality of the calculator to ensure it correctly display.

### Input Domain Modelling

- **Identify Testable Functions**:

  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:

  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**: If calculator show “infinity”, -infinity and “NaN” mean that addtoDisplay = false resulting in display 0. after click decimal(.) button
    - **Non-Numeric Input**: If any input is non-numeric (like a string or special character), it should throw an error.
    - **Fraction Input**: If fractions like `1/2` are entered, the system should reject it and throw an error since fractions are not supported (but decimals like `0.5` are).

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:

      | **Characteristic**           | **b1**                 | **b2**             | **b3**              | **b4**                   | **b5**               | **b6**                | **b7**                             | **b8**                              |
      | ---------------------------- | ---------------------- | ------------------ | ------------------- | ------------------------ | -------------------- | --------------------- | ---------------------------------- | ----------------------------------- |
      | C1 = _value of firstNumber_  | integer greater than 0 | integer equal to 0 | integer less than 0 | decimal greater than 0.0 | decimal equal to 0.0 | decimal less than 0.0 | Not a Number (addToDisplay = true) | Not a Number (addToDisplay = false) |


    - **Functionality-Based Characteristics**:

      | **Characteristic**               | **b1**           | **b2**                    | **b3**                             |
      | -------------------------------- | ---------------- | ------------------------- | ---------------------------------- |
      | C1 = _result of the calculation_ | Remain unchanged | Appending a decimal point | Reset to 0. (addToDisplay = false) |

  - **Identify (possible) values**:

    - **Interface-Based Characteristics**:

  | **Characteristic**           | **b1** | **b2** | **b3** | **b4** | **b5** | **b6** | **b7**                      | **b8**                     |
  | ---------------------------- | ------ | ------ | ------ | ------ | ------ | ------ | --------------------------- | -------------------------- |
  | C1 = _value of firstNumber_  | 5      | 0      | -5     | 5.0    | 0.0    | -5.0   | Hello (addToDisplay = true) | NaN (addToDisplay = false) |


  - **Functionality-Based Characteristics**:
    | **Characteristic** | **b1** | **b2** | **b3** |
    | -------------------------------- | ------ | ------- | ------ |
    | C1 = _result of the calculation_ | 5 to 5 | 5 to 5. | 0. |

## = testEquals() 

### Goal of the test case:
To test the equal function when the two numbers is combined with the operations successfully.

### Input Domain Modelling
- **Identify Testable Functions**: 
  - `btnEqual.doClick()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:
  - **Parameters**: `TypedNumber, SecondNumber, SelectedOperation`
  - **Return Type**: `String`
  - **Return Value**: `Result from selected parameter`
  - **Exceptional Behavior**: None

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:
    
      | **Characteristic**                           |**b1**        | **b2**     |   **b3**    | **b4**   |  **b5** |  **b6** |
      |----------------------------------------------|--------------|------------|-------------|----------|---------|---------|
      | C1 = *Value of the typed number*             |greater than 0| equal to 0 | less than 0 |          |         |         |
      | C2 = *Value of the Second number*            |greater than 0| equal to 0 | less than 0 |          |         |         |
      | C3 = *the Selected Operations*               |+             |-           |*            |/         |%        |^        |


    - **Functionality-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |
      |--------------------|--------------|------------|------------|----------|-------------|---------|
      | C1 = *the result*| greater than 0  | equal to 0 | less than 0 | infinity | -infinity | NaN     |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
    
      | **Characteristic**                           |**b1**        | **b2**     |   **b3**    | **b4**   |  **b5** |  **b6** |
      |----------------------------------------------|--------------|------------|-------------|----------|---------|---------|
      | C1 = *Value of the typed number*             |5             | 0          | -2          |          |         |         |         
      | C2 = *Value of the Second number*            |3             | 0          |-6           |          |         |         |     
      | C3 = *the Selected Operations*               |+             |-           |*            |/         |%        |^        |

    - **Functionality-Based Characteristics**:
    
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |
      |--------------------|--------------|------------|------------|----------|-------------|---------|
      | C1 = *the result*| greater than 0  | equal to 0 | less than 0 | infinity | -infinity | NaN     |

- **Combine partitions to define test requirements**:


  - **Test requirements**: **2 base used** => 2 + ( 2 * (3 - 2) ) + ( 2 * (3 - 2) ) + ( 2 * (6 - 2) ) = **14 test cases**

- **Derive test values and expected values:** **Multiple Base Coverage Criteria (MBCC):**
    **Selected Base:** ( Greater than 0, Greater than 0 , + ) , ( Greater than 0, Less than 0 , + )
     
  | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
  |--------------------|---|---|---|
  | T1 ( a > 0, b > 0, + )   | 5 | 3 | 8 |
  | T2 ( a > 0, b > 0, - ) | 7 | 2 | 5 |
  | T3 ( a > 0, b > 0, * ) | 6 | 2 | 12 |
  | T4 ( a > 0, b > 0, / ) | 18 | 3 | 6 |
  | T5 ( a > 0, b > 0, ^ ) | 4 | 3 | 64 |
  | T6 ( a > 0, b > 0, % ) | 100 | 10 | 0 |
  | T7 ( a < 0, b > 0, + ) | -8 | 10 | 2 |
  | T8 ( a > 0, b < 0, + )| 14 | -16 | -2 |
  | T9 ( a > 0, b < 0, - ) | 1 | -9 | 10 |
  | T10 ( a > 0, b > 0, * ) | 5 | -7 | -35 |
  | T11 ( a > 0, b > 0, / ) | 27 | -9 | -3 |
  | T12   ( a > 0, b < 0, ^ )| 0 | 1 | -1 |
  | T13  ( a < 0, b < 0, + ) | -2 | -1 | -3 |
  | T14  ( a = 0, b < 0, + ) | 0 | -4 | -4 |

