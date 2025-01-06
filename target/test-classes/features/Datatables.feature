Feature: Demonstrating the data table feature of cucumber

  Cucumber provide ability to organize repeating steps with diffrent data
  using the data table feature and automatically convert the table into
  few known data types supported by cucumber


  Scenario: Petting zoo
    Given I have a "Horse"
    And I have a "Cat"
    And I have a "Dog"
    And I have a "Zebra"
    When I call their names
    Then They come to me

  Scenario: Petting zoo with table
    Given I have the following animals
      | Animal | Type     |
      | Horse  | Carraige |
      | Cat    | Milk     |
      | Dog    | Rex      |
      | Zebra  | Dunky    |
    When I call their names
    Then They come to me

  @ui
  Scenario: Login to weborder app by providing username password in 2 column table
    Given we are at web order login page
    When we provide below credentials
      | username | tester |
      | password | test   |
    Then I should see all order page

  Scenario: Representing table with header and more than 2 columns
    Given This is the product refrence
      | Product      | Price | Discount |
      | MyMoney      | 100   | 0.08     |
      | FamilyAlbum  | 20    | 0.15     |
      | ScreenSvaver | 18    | 0.1      |