Feature: AktivitetsOprettelse
  Description: Når en projektleder opretter en aktivitet
  Actors: Projektleder

  Scenario: Oprettelse af aktivitet under et projekt med start dato
    When Projektlederen går ind i Manage Project i menuen
    Then Projektlederen går ind i to add activity
    And Vælger hvilket projekt, der skal tilføjes an activity til
    And Giver aktiviteten et navn
    And Angive hvilken slags activity det er
    And Vælger at sætte start dato
    And Angiver slut dato
    Then Bliver aktiviteten gemt

  Scenario: Oprettelse af aktivitet under et projekt uden start dato
    When Projektlederen går ind i Manage Project i menuen
    Then Projektlederen går ind i to add activity
    And Vælger hvilket projekt, der skal tilføjes an activity til
    And Giver aktiviteten et navn
    And Angive hvilken slags activity det er
    And Vælger ikke at sætte start dato
    Then Bliver aktiviteten gemt
