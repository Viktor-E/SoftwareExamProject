Feature: Activity creation

  Scenario: A user creates activity
    Given there is a user with the name Test
    When Project is created
    When creating activity
    Then activity is created


#  Scenario: None project leader create activity
#    Given there is a user with the name Test
#    Given project exists
#    Given user is not project leader
#    When creating activity
#    Then activity is not created
