@TP6 @Login
Feature: An user log in from My Account

  Scenario: Log in with valid username and password
    Given The client is in automation testing page
    When The client log in with the user Crowdar123 and the password Crowdar123
    Then User is logged in

  Scenario: Log in with incorrect username and incorrect password.
    Given The client is in automation testing page
    When The client log in with the user invalidUser and the password invalidPasswd
    Then it does not enter
    And The error message user name not registered appears

  Scenario: Log in with correct username and empty password
    Given The client is in automation testing page
    When The client log in with the user Crowdar123 and the password ''
    Then it does not enter
    And Password required error message appears
