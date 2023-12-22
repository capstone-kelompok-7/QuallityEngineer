#Feature: Order
#  As an user
#  I want to access Order
#  So that I can manage Order
#
#  @GetAllOrder
#  Scenario: GET - All Order (positive)
#    Given I set GET endpoints All Order
#    When I send GET HTTP request All Order
#    Then I receive valid HTTP response code 200
#  @GetAllOrder
#  Scenario: GET - All Order with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Order
#    When I send invalid GET HTTP request All Order
#    Then I receive valid HTTP response code 404
#  @GetAllOrder
#  Scenario: GET - All Order with invalid case forbidden (negative)
#    Given I set GET endpoints All Order
#    When I send invalid GET HTTP request All Order forbidden
#    Then I receive valid HTTP response code 401
#
#  @GetOrderById
#  Scenario: GET - Order by Id (positive)
#    Given I set GET endpoints Order by Id
#    When I send GET HTTP request Order by Id
#    Then I receive valid HTTP response code 200
#  @GetOrderById
#  Scenario: GET - Order by Id with invalid case forbidden (negative)
#    Given I set GET endpoints Order by Id
#    When I send invalid GET HTTP request Order by Id forbidden
#    Then I receive valid HTTP response code 401
#
#  @GetAllPayment
#  Scenario: GET - All Payment (positive)
#    Given I set GET endpoints All Payment
#    When I send GET HTTP request All Payment
#    Then I receive valid HTTP response code 200
#  @GetAllPayment
#  Scenario: GET - All Payment with invalid case forbidden (negative)
#    Given I set GET endpoints All Payment
#    When I send invalid GET HTTP request All Payment forbidden
#    Then I receive valid HTTP response code 401
#
##  @PostConfirmPayment
##  Scenario: POST - Confirm Payment with valid endpoints (positive)
##    Given I set POST endpoints Confirm Payment
##    When I send POST HTTP request Confirm Payment
##    Then I receive valid HTTP response code 200
##
##  @PostCancelPayment
##  Scenario: POST - Cancel Payment with valid endpoints (positive)
##    Given I set POST endpoints Cancel Payment
##    When I send POST HTTP request Cancel Payment
##    Then I receive valid HTTP response code 200
#
##  @PutUpdateOrderStatus
##  Scenario: PUT - Update a Order Status with valid endpoints (positive)
##    Given I set PUT endpoints Order Status
##    When I send PUT HTTP request Order Status
##    Then I receive valid HTTP response code 200
#
