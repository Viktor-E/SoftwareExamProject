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

  Scenario: User tries to register a time bigger than expected work hours
    Given there is a user with the name Test
    Given activity
    When user enters a number bigger than expected work hours
    Then time is not registered

  Scenario: User tries to register a date older than 30 days
    Given there is a user with the name Test
    Given activity
    When user enters a date older than 30 days
    Then Time is not registered since date is too old

  Scenario: User tries to register a date older than 30 days
    Given there is a user with the name Test
    Given activity
    When user enters a date not older than 30 days
    Then Time is registered2