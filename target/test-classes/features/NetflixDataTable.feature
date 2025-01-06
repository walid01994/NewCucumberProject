Feature: Movie suggestion feature

  As a user
  I should be able to get movies according to my preference

  Scenario: Movie search
    Given I like "actions"
    And I like "Western"
    And I like "Anime"
    And I like "Adventure"
    When I go to home page
  Then i should get recommendations

    Scenario: Movie search datatable
      Given I like
      | actions |
      | Western |
      | Anime |
      | Adventure |
      When I go to home page
      Then i should get recommendations

  Scenario: Movie search datatable2
    Given I like these
      | actions   | Jhon Wick  |
      | Western   | Brothers   |
      | Anime     | One Peace  |
      | Adventure | Tomb Rider |
    When I go to home page
    Then i should get recommendations