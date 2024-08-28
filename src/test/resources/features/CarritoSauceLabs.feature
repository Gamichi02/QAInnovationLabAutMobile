@FuncionalidadCarritoSauceLabs
Feature: Funcionalidad del carrito de compras en la aplicación SauceLabs

  @ValidarCarritoSauceLabs
  Scenario Outline: Agregar productos al carrito y validar
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego "<UNIDADES>" del siguiente producto "<PRODUCTO>"
    Then valido que el carrito de compra se actualice correctamente

    Examples:
      | PRODUCTO                   | UNIDADES |
      | Sauce Labs Backpack        | 1        |
      | Sauce Labs Bolt T-Shirt    | 1        |
      | Sauce Labs Bike Light      | 2        |