Feature: ProjektOprettelse
  Description: Når en medarbejder vil oprette et nyt projekt
  Actors: Medarbejdere

  Scenario: Opret Projekt
    When En medarbejder opretter et nyt projekt
    Then Skal det have et navn, der ikke eksisterer i forvejen
    Then Skal projektet kategoriseres som Kunde/Internt
    And Der skal angives starttidspunkt, hvis denne kendes
    And Der skal angives Projektleder, hvis denne kendes
    Then Vil projektet gemmes

