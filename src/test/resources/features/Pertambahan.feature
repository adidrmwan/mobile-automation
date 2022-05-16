Feature: As User I want to get the result of sum

  @sum
  Scenario: User Can Sum some number
    Given user on calculator page
    When user choose first number 3
    And user tap "plus"
    And And user choose second number 9
    And user tap "equal"
    Then user see the result of sum