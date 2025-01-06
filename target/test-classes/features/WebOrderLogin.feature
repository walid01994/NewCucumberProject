@smoke
Feature: Weborder  app login feature
  As a user
  I should be able to login to web order app

  Background:
    Given we are at web order login page

  Scenario: user login successfully
    #Given we are at web order login page
    When I provide valid credentials
    Then I should see all order page

  Scenario: User login fail
      #Given we are at web order login page
    When I provide invalid credentials
    Then I should still be at the login page
    And login error message should be present

  Scenario: User login with specific credentials
    When user provide username "Tester" and password "test"
    Then I should see all order page


