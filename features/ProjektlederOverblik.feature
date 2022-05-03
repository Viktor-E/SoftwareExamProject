Feature: ProjektlederOverblik
  Description: Når projektlederen tjekker op på et projekt
  Actors: Projektleder

  Scenario: Projektlederens overblik
    When Projektlederen åbner en projektside
    Then Projektlederen kan se aktiviteter på projektet
    And Projektlederen kan oprette aktivitet
    And Projektlederen kan se registreret tid på aktiviteterne
    And Projektlederen kan redigere projektet