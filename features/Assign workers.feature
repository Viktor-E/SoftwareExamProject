Feature: Assign workers

  Scenario: A user Assign workers
    Given there is a user with the name Test
    Given activity
    When assign workers
    Then workers are assigned


#    Scenario: None project leader tries to assign workers
#      Given there is a user with the name Test
#      Given user is not project leader
#      When assign workers
#      Then workers are not assigned
