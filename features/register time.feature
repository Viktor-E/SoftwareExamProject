Feature: register time
  A user has to be able to register time spent on project


  Scenario: User register used time
    Given there is a user with the name Test
    Given activity
    When user register time
    Then time is registered