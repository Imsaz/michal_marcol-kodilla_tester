Feature: Is it divided?
  Everybody plays the game

  Scenario Outline: Divided or not
    Given Example <number>
    When I ask whether the number is divided
    Then I should be told <answer>
    Examples:
      | number | answer |
      | number is 3 | "Fizz" |
      | number is 5 | "Buzz" |
      | number is 15 | "FizzBuzz" |
      | number is 4 | "None" |

