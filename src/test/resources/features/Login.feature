@Android @LoginAndroid
Feature: User be able to login

  @Negative @Unregistered-User
  Scenario: Android user see error message when login using unregistered user
    Given android user on landing screen
    When android user input unregistered email
    And android user input password
    And android user tap login button
    Then android user see error message is displayed