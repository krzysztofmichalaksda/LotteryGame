Feature: feature1

  Scenario: welcome message for the user
    When the user with Jan name and Nowak last name is created
    Then welcome message should contain: "Jan Nowak"