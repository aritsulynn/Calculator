## (=) testEquals() ยังไม่เสร็จจ้า

### Goal of the test case:
To test the equal function when the two numbers is combined with the operations successfully.

### Input Domain Modelling
- **Identify Testable Functions**: 
  - 

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:
  - **Parameters**: TypedNumber, SecondNumber, SelectedOperation
  - **Return Type**: String
  - **Return Value**: Result from selected parameter
  - **Exceptional Behavior**: 
    - **Non-Numeric Input**: 
    - **Fraction Input**: 

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


  - **Test requirements**: 2 base used => 2 + ( 2 * (3 - 2) ) + ( 2 * (3 - 2) ) + ( 2 * (6 - 2) ) = 14 test cases
     


