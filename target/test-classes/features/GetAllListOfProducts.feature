@Product
Feature: List of Products
  As a user i should get all product names prices and discounts


  Scenario: user login successfully
    Given we are at web order login page
    When I provide valid credentials
    Then I should see all order page

    Scenario: user opens List of products and get all data
      Given I am on the on the List of Products
      When I get the price and discount percentage
      Then I should be able to calculate the final price