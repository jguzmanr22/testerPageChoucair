Feature: Valid Employee

  Scenario: Validando la seccion Empleos
    Given Empleo esta en CHOUCAIR home page
    When el usuario haga click en la seccion "Empleo"
    Then existe la frase "SER CHOUCAIR"