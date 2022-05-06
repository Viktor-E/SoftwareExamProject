Feature: AktivitetsOprettelse
  Description: Når en projektleder opretter en aktivitet
  Actors: Projektleder

  Scenario: Oprettelse af aktivitet under et projekt
    When En projektleder opretter en aktivitet under et projekt
    Then Skal projektlederen angive start og slut uge
    And Angive forventede antal timer
    Then Vil aktiviteten gemmes
