Feature: UddelAktivitet
  Description: Projektlederen skal uddele en aktivitet
  Actors: Projektleder

  Scenario: Når Projektlederen skal uddelegere en aktivitet
    When Projektleder skal uddelegere en aktivitet
    Then Kan projektlederen se, hvilke medarbejdere, der har tid
    And Kan give aktiviteten til en medarbejder, der er ledig
    Then Vil medarbejderen få aktiviteten tildelt