#Feature: Product
#  As an user
#  I want to access product
#  So that I can manage product
#
#  @GetAllProduct
#  Scenario: GET - All Product (positive)
#    Given I set GET endpoints All Product
#    When I send GET HTTP request All Product
#    Then I receive valid HTTP response code 200
#  @GetAllProduct
#  Scenario: GET - All Product with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Product
#    When I send invalid GET HTTP request All Product
#    Then I receive valid HTTP response code 404
##  @GetAllProduct
##  Scenario: GET - All Product with invalid case forbidden (negative)
##    Given I set GET endpoints All Product
##    When I send invalid GET HTTP request All Product forbidden
##    Then I receive valid HTTP response code 401
#
#  @GetProductById
#  Scenario: GET - Product by Id (positive)
#    Given I set GET endpoints Product by Id
#    When I send GET HTTP request Product by Id
#    Then I receive valid HTTP response code 200
#  @GetProductById
#  Scenario: GET - Product by Id with invalid endpoint (negative)
#    Given I set invalid GET endpoints Product by Id
#    When I send invalid GET HTTP request Product by Id
#    Then I receive valid HTTP response code 404
#
#  @PostCreateProduct
#  Scenario: POST - Create a Product with valid endpoints (positive)
#    Given I set POST endpoints Product
#    When I send POST HTTP request Product
#    Then I receive valid HTTP response code 201
#
#  @PutUpdateProduct
#  Scenario: Put - An update Product with valid endpoint (positive)
#    Given I set PUT endpoints update Product
#    When I send PUT HTTP request update Product
#    Then I receive valid HTTP response code 200
#
#  @DeleteProduct
#  Scenario: DELETE- Delete Product with valid endpoint (positive)
#    Given I set DELETE endpoints delete Product
#    When I send DELETE HTTP request delete Product
#    Then I receive valid HTTP response code 200

