#Feature: Order Management
#  As a user
#  I want to view order details by ID, create orders, create orders from the cart, view all orders, accept orders, and track orders
#  So that I can manage my order information
#
#  @GetDetailsOrderById
#  Scenario: GET - Details Order By Id (positive)
#    Given I set GET endpoints for retrieving details of an order by ID
#    When I send GET HTTP request for details of an order by ID
#    Then I receive a valid HTTP response code 200
#
#  @GetDetailsOrderByIdInvalid
#  Scenario: GET - Details Order By Id with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving details of an order by ID
#    When I send invalid GET HTTP request for details of an order by ID
#    Then I receive a valid HTTP response code 404
#
#  @PostCreateOrder
#  Scenario: POST - Create Order (positive)
#    Given I set POST endpoints for creating an order
#    When I send POST HTTP request to create an order
#    Then I receive a valid HTTP response code 201
#
#  @PostCreateOrderInvalid
#  Scenario: POST - Create Order with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for creating an order
#    When I send invalid POST HTTP request to create an order
#    Then I receive a valid HTTP response code 404
#
#  @PostCreateOrderFromCart
#  Scenario: POST - Create Order From Cart (positive)
#    Given I set POST endpoints for creating an order from the cart
#    When I send POST HTTP request to create an order from the cart
#    Then I receive a valid HTTP response code 201
#
#  @PostCreateOrderFromCartInvalid
#  Scenario: POST - Create Order From Cart with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for creating an order from the cart
#    When I send invalid POST HTTP request to create an order from the cart
#    Then I receive a valid HTTP response code 404
#
#  @GetAllOrder
#  Scenario: GET - All Orders (positive)
#    Given I set GET endpoints for retrieving all orders
#    When I send GET HTTP request for retrieving all orders
#    Then I receive a valid HTTP response code 200
#
#  @GetAllOrderInvalid
#  Scenario: GET - All Orders with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving all orders
#    When I send invalid GET HTTP request for retrieving all orders
#    Then I receive a valid HTTP response code 404
#
#  @PutAcceptOrder
#  Scenario: PUT - Accept Order (positive)
#    Given I set PUT endpoints for accepting an order
#    When I send PUT HTTP request to accept an order
#    Then I receive a valid HTTP response code 200
#
#  @PutAcceptOrderInvalid
#  Scenario: PUT - Accept Order with Invalid Endpoint (negative)
#    Given I set invalid PUT endpoints for accepting an order
#    When I send invalid PUT HTTP request to accept an order
#    Then I receive a valid HTTP response code 404
#
#  @GetTrackingOrder
#  Scenario: GET - Tracking Order (positive)
#    Given I set GET endpoints for tracking an order
#    When I send GET HTTP request for tracking an order
#    Then I receive a valid HTTP response code 200
#
#  @GetTrackingOrderInvalid
#  Scenario: GET - Tracking Order with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for tracking an order
#    When I send invalid GET HTTP request for tracking an order
#    Then I receive a valid HTTP response code 404
