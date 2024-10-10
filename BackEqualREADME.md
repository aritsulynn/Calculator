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
        **Selected Base:** ( True, Greater than 0 , 1-digit ), ( True, Less than 0 , Many Digits )
     
  | **Test** | **InputNumber** | **Expected result** |
  |----------|-----------------|---------------------|
  | T1 ( True, Positive, 1-digit )   | 6 | 0 |
  | T2 ( True, Positive, Many digits ) | 25 | 2 |
  | T3 ( True, Negative , Many digits ) | -14 | 1 |
  | T4 ( True, Negative , 1-digit ) | -8 | 0 |

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
  | TC1 ( a > 0, b > 0, + )   | 5 | 3 | 8 |
  | TC2 ( a > 0, b > 0, - ) | 7 | 2 | 5 |
  | TC3 ( a > 0, b > 0, * ) | 6 | 2 | 12 |
  | TC4 ( a > 0, b > 0, / ) | 18 | 3 | 6 |
  | TC5 ( a > 0, b > 0, ^ ) | 4 | 3 | 64 |
  | TC6 ( a > 0, b > 0, % ) | 100 | 10 | 0 |
  | TC7 ( a < 0, b > 0, + ) | -8 | 10 | 2 |
  | TC8 ( a > 0, b < 0, + )| 14 | -16 | -2 |
  | TC9 ( a > 0, b < 0, - ) | 1 | -9 | 10 |
  | TC10 ( a > 0, b > 0, * ) | 5 | -7 | -35 |
  | TC11 ( a > 0, b > 0, / ) | 27 | -9 | -3 |
  | TC12   ( a > 0, b < 0, ^ )| 0 | 1 | -1 |
  | TC13  ( a < 0, b < 0, + ) | -2 | -1 | -3 |
  | TC14  ( a = 0, b < 0, + ) | 0 | -4 | -4 |

