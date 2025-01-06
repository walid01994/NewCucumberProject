Feature: This feature will have scenarios for the library website

  Scenario Outline: Login to weborder and try some stuff
    Given we are at the libary page
    When I use "<username>" and "<password>"
    Then I should see all library page
    Examples:
      | username                | password            |
      | abidwalid1994@gmail.com | Cabrage@stoppiz1994 |
      | lightswalid@gmail.com   | Cabrage@stoppiz1994 |

