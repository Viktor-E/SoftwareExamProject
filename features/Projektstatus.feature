Feature: Overblik over projektstatus
  Description: Når en projektleder skal tjekke status ad et projekt
  Actors: Projektleder

  Scenario: Tjek Projektstatus
    When Projektleder åbner projektoverblikket
    Then åbner en side med projektstatus