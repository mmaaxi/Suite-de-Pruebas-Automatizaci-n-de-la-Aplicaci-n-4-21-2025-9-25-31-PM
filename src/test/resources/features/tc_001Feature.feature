Feature: Inicio de sesión exitoso

  Scenario: Usuario inicia sesión con credenciales válidas
    Given un usuario en la página de inicio de sesión
    When ingresa credenciales válidas
    Then el sistema redirige al dashboard
    And la sesión se mantiene activa