Feature: Realizar reserva de habitacion


  @HappyPathBook
  Scenario Outline: Realizar una seleccion correcta de habitacion en booking
    Given que como usuario registrado realizo el login en el aplicativo "<usuario>" "<password>"
    When deseo realizar la busqueda de una habitacion en el "<destino>"
    And selecciono la habitacion del listado de busqueda
    And verifico que el precio de la habitacion sea el correcto
    Then valido la seleccion correcta de la habitacion

    Examples:
      | usuario         | password    | destino |
      | prueba@book.com | Testing2023 | Cusco   |