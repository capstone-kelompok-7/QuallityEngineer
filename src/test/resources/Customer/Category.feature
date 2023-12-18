Feature: Category
  As an user
  I want to access category
  So that I can manage category customer

  @GetAllCategory
  Scenario: GET - All Category Customer (positive)
    Given I set GET endpoints All Category Customer
    When I send GET HTTP request All Category Customer
    Then I receive valid HTTP response code 200
  @GetAllCategory
  Scenario: GET - All Category Customer with invalid endpoint (negative)
    Given I set invalid GET endpoints All Category Customer
    When I send invalid GET HTTP request All Category Customer
    Then I receive valid HTTP response code 404
  @GetAllCategory
  Scenario: GET - All Category Customer with invalid case forbidden (negative)
    Given I set GET endpoints All Category Customer
    When I send invalid GET HTTP request All Category Customer forbidden
    Then I receive valid HTTP response code 401