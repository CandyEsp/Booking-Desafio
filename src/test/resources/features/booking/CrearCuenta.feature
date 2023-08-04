Feature: Crear cuenta de usuario


  @HappyPathCreate
  Scenario Outline: Crear cuenta con password correcto
    Given que deseo registrarme como el usuario "<usuario>"
    When ingreso un "<password>" correcto
    Then se debe mostrar la pantalla de inicio

    Examples:
      | usuario            | password    |
      | pruebas11@book.com | Testing2024 |

  @UnHappyPathCreate
  Scenario Outline: Crear cuenta con password incorrecto
    Given que deseo registrarme como el usuario "<usuario>"
    When ingreso un "<password>" incorrecto
    Then valido el mensaje de alerta en pantalla

    Examples:
      | usuario          | password    |
      | testing@book.com | testing2023 |