#Feature: Shopping Cart Management
#  As a user
#  I want to add products to my cart, view the details of my cart, reduce quantity, and delete cart items
#  So that I can manage my shopping cart contents
#
#  @PostAddProductToCart
#  Scenario: POST - Add Product to Cart (positive)
#    Given I set POST endpoints for adding a product to the cart
#    When I send POST HTTP request to add a product to the cart
#    Then I receive a valid HTTP response code 201
#
#  @PostAddProductToCartInvalid
#  Scenario: POST - Add Product to Cart with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for adding a product to the cart
#    When I send invalid POST HTTP request to add a product to the cart
#    Then I receive a valid HTTP response code 404
#
#  @GetDetailCart
#  Scenario: GET - Detail Cart (positive)
#    Given I set GET endpoints for retrieving the detail of the cart
#    When I send GET HTTP request for the detail of the cart
#    Then I receive a valid HTTP response code 200
#
#  @GetDetailCartInvalid
#  Scenario: GET - Detail Cart with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving the detail of the cart
#    When I send invalid GET HTTP request for the detail of the cart
#    Then I receive a valid HTTP response code 404
#
#  @PutReduceQuantity
#  Scenario: PUT - Reduce Quantity (positive)
#    Given I set PUT endpoints for reducing the quantity of an item in the cart
#    When I send PUT HTTP request to reduce the quantity of an item in the cart
#    Then I receive a valid HTTP response code 200
#
#  @PutReduceQuantityInvalid
#  Scenario: PUT - Reduce Quantity with Invalid Endpoint (negative)
#    Given I set invalid PUT endpoints for reducing the quantity of an item in the cart
#    When I send invalid PUT HTTP request to reduce the quantity of an item in the cart
#    Then I receive a valid HTTP response code 404
#
#  @DeleteCartItems
#  Scenario: DELETE - Delete Cart Items (positive)
#    Given I set DELETE endpoints for deleting items from the cart
#    When I send DELETE HTTP request to delete items from the cart
#    Then I receive a valid HTTP response code 200
#
#  @DeleteCartItemsInvalid
#  Scenario: DELETE - Delete Cart Items with Invalid Endpoint (negative)
#    Given I set invalid DELETE endpoints for deleting items from the cart
#    When I send invalid DELETE HTTP request to delete items from the cart
#    Then I receive a valid HTTP response code 404
