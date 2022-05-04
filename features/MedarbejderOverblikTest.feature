Feature: MedarbejderOverblik
  Description: Når en medarbejder åbner programmet
  Actors: Medarbejder

  Scenario: Medarbejder overblik
    When En medarbejder logger ind {correct}
    Then Kan medarbejderen se aktiviteter
    And En medarbejder kan registrere tid på aktiviteter
    And Medarbarbejder kan logge ud