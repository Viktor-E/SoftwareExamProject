Feature: MedarbejderOverblik
  Description: Når en medarbejder åbner programmet
  Actors: Medarbejder

  Scenario: Medarbejder overblik
    Given En medarbejder er logget ind
    Then Kan medarbejderen se aktiviteter
    And En medarbejder kan registrere tid på aktiviteter
    And Medarbarbejder kan logge ud