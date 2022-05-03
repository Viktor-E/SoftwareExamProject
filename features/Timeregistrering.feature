Feature: Timeregistrering
  Description: Når en medarbejder registrerer den tid, de har brugt på aktiviteter
  Actors: Medarbejder

  Scenario: Timeregistrering af medarbejder
    Given Medarbejder har arbejdet i 3 timer
    When En medarbejder er logget ind
    And Medarbejderen registrere timer på en aktivitet
    Then Bliver tiden registreret i systemet