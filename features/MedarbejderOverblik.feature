Feature: MedarbejderOverblik
  Description: Når en medarbejder åbner programmet
  Actors: Medarbejder

  Scenario: Medarbejder overblik
    When En medarbejder logger ind
    Then Kan medarbejderen se aktiviteter
    And Registrere tid på aktiviteter
    And Logge ud