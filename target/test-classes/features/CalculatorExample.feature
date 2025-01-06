Feature: Calculator example

@calc
  Scenario Outline: Adding multiple two numbers
    Given calculator app is open
    When i add <num1> and <num2>
    Then i should get <result> displayed
    Examples:
      | num1 | num2 | result |
      | 56   | 5    | 61     |
      | 5    | 5    | 10     |
      | 8    | 9    | 17     |
      | 7    | 6    | 13     |

