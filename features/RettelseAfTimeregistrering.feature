Feature: RettelseAfTimeregistrering
  Description: Når en medarbejder skal rette i de timer, der er brugt på aktiviteter
  Actors: Medarbejdere

  Scenario: Ret timeregistrering
    Given: At en medarbejder har skrevet en forkert tid ind
    When En medarbejder logger ind
    Then Kan en medarbejderen vælge en aktivitet
    And Medarbejderen kan ændre den angivne tid på aktiviteten