Feature: register time
  A user has to be able to register time spent on project


  Scenario: User register used time
    Given there is a user with the name Test
    Given activity
    When user register time
    Then time is registered

  Scenario: User tries to register a negative time
    Given there is a user with the name Test
    Given activity
    When user enters negative time register time
    Then time is not registered