Feature: check which workers are assigned to a activity

  Scenario: a user checks which workers are assigned to a activity
    Given there is a user with the name Test
    Given activity
    Given user is assigned to activity
    Then the user is listed