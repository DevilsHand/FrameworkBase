@Login
Feature: Login no Site

  Scenario: Teste de login na pagina inicial
    Given que estou na pagina de login
    When Faco o login com os dados corretos
    Then confirmo o acesso a pagina principal
