Feature: Add product to cart
  Yo como usuario, quiero agregar
  productos al carrito de compras
  para poder pagar.

  @addProduct
  Scenario: producto agregado exitosamente
    Given que el usuario abra el navegador en la url de haceb
    When el usuario busque el producto y lo seleccione
      | categoria |
      | true     |
    Then el usuario podrá visualizar el producto en el carrito