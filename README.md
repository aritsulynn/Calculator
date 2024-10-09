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
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| greater than 0      | equal to 0         | less than 0        |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| 5      | 0         | -5        |

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
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| greater than 0      | equal to 0         | less than 0        |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| 5      | 0         | -5        |

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
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |
      |--------------------|--------------|------------|------------|----------|-------------|---------|
      | C1 = *result of the calculation*| greater than 0  | equal to 0 | less than 0 | infinity | -infinity | NaN |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |
      |--------------------|--------------|------------|------------|----------|-------------|---------|
      | C1 = *result of the calculation*| 5      | 0         | -5        |  infinity | -infinity | NaN | 

- **Combine partitions to define test requirements**:
  - **Test requirements**: 

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
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             | **b4** | **b5** |
      |---------------------------------|---------------------|--------------------|--------------------|--------|--------------|
      | C1 = *result of the calculation*| greater than 1      | equal to 1         | equal to 0        | less than 0 | infinity |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             | **b4** | **b5** |
      |---------------------------------|---------------------|--------------------|--------------------|--------|--------|
      | C1 = *result of the calculation*| 8      | 1 | 0         | -0.125        | infiinity |

- **Combine partitions to define test requirements**:
  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
    `Each Choice Coverage (ECC)`
    | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
    |--------------------|---|---|---|
    | T1 (>0, >0) | 2 | 3 | 8 |
    | T2 (>0, 0)  | 2 | 0 | 1 |
    | T3 (0, >0)  | 0 | 3 | 0 |
    | T4 (<0, <0) | -2 | -3 | -0.125 |
    | T5 (0, <0)  | 0 | -3 | infinity |



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
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             | **b4**             |
      |------------------------------|----------------------|--------------------|--------------------|--------------------|
      | C1 = *value on the screen*   | NaN                  | equal to 0         | greater than 0     | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             |
      |---------------------------------|---------------------|--------------------|
      | C1 = *Is Button visible        *| True                | False              |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             | **b4**             |
      |------------------------------|----------------------|--------------------|--------------------|--------------------|
      | C1 = *value on the screen*   | NaN                  | 0                  | 1                  | -1                 |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             |
      |---------------------------------|---------------------|--------------------|
      | C1 = *Is Button visible*        | True                | False              |

- **Combine partitions to define test requirements**:
  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
    - Merge **Functionality-Based Characteristics** and **Interface-Based Characteristics** for test cases
      | **Characteristic**           | **b1**               | **b2**             | **b3**             | **b4**             |
      |------------------------------|----------------------|--------------------|--------------------|--------------------|
      | C1 = *Is Button visible*     | True                 | False              |                    |                    |
      | C2 = *value on the screen*   | NaN                  | equal to 0         | greater than 0     | less than 0        |
     
    `Base Choice Coverage (BCC)` select (True, NaN) for base
    | **Test**           | **Value on Screen** | **Expected result** |
    |--------------------|---------------------|---------------------|
    | T1 (True, NaN)     | NaN                 | 0                   |
    | T2 (True, NaN)     | 0                   | 0                   |
    | T3 (True, NaN)     | 1                   | 0                   |
    | T4 (True, NaN)     | -1                  | 0                   |
    | T5 (False, NaN)    | NaN                 | NaN                 |


## (.) testDecimal()

### Goal of test case:
To test the decimal functionality of the calculator to ensure it correctly display.

### Input Domain Modelling
- **Identify Testable Functions**: 
  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:
  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**: If calculator show “infinity”, -infinity and  “NaN” mean that addtoDisplay = false resulting in display 0. after click decimal(.) button
    - **Non-Numeric Input**: If any input is non-numeric (like a string or special character), it should throw an error.
    - **Fraction Input**: If fractions like `1/2` are entered, the system should reject it and throw an error since fractions are not supported (but decimals like `0.5` are).

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |**b7**   |    **b8**   |
      |--------------------|--------------|------------|------------|----------|-------------|---------|----------|-------------|
      | C1 = *value of firstNumber*   | integer greater than 0  | integer equal to 0  | integer less than 0 | decimal greater than 0.0 | decimal equal to 0.0 | decimal less than 0.0 | Not a Number (addToDisplay = true) | Not a Number (addToDisplay = false)
      | C2 = *value of secondNumber*  | integer greater than 0  | integer equal to 0    | integer less than 0  | decimal greater than 0.0 | decimal equal to 0.0 | decimal less than 0.0 | Not a Number (addToDisplay = true) | Not a Number (addToDisplay = false) |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   |
      |--------------------|--------------|------------|------------|
      | C1 = *result of the calculation*| Remain unchanged  | Appending a decimal point | Reset to 0. (addToDisplay = false) |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
   | **Characteristic** |    **b1**    |   **b2**   |   **b3**   | **b4**   |    **b5**   |  **b6** |**b7**   |    **b8**   |
   |--------------------|--------------|------------|------------|----------|-------------|---------|----------|-------------|
   | C1 = *value of firstNumber*   | 5  | 0  | -5 | 5.0 |  0.0 | -5.0 | Hello (addToDisplay = true) | NaN (addToDisplay = false)
   | C2 = *value of secondNumber*  | 5  | 0  | -5 | 5.0 |  0.0 | -5.0 | Hello (addToDisplay = true) | NaN (addToDisplay = false) |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic** |    **b1**    |   **b2**   |   **b3**   |
      |--------------------|--------------|------------|------------|
      | C1 = *result of the calculation*| 5 to 5  | 5 to 5. | 0. |

- **Combine partitions to define test requirements**:
  - **Test requirements**: 
