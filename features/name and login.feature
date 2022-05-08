Feature: name and login
  Checking name validator and user login


  Scenario: testing name validator
    When employee enters a four letter name
    Then Name is valid

  Scenario:
    When employee enters a none four letter name
    Then Name is invalid

  Scenario: user login
    Given there is a user with the name Test
    When  test logs in
    Then  test is logged in


