Feature: Product
  As an user
  I want to access product
  So that I can manage product

  @GetProductPreferences
  Scenario: GET - Product Preferences (positive)
    Given I set GET endpoints Product Preferences
    When I send GET HTTP request Product Preferences
    Then I receive valid HTTP response code 200
  @GetProductPreferences
  Scenario: GET - Product Preferences with invalid endpoint (negative)
    Given I set invalid GET endpoints Product Preferences
    When I send invalid GET HTTP request Product Preferences
    Then I receive valid HTTP response code 404

  @GetOtherProducts
  Scenario: GET - Other Products (positive)
    Given I set GET endpoints Other Products
    When I send GET HTTP request Other Products
    Then I receive valid HTTP response code 200
  @GetOtherProducts
  Scenario: GET - OtherProducts with invalid endpoint (negative)
    Given I set invalid GET endpoints OtherProducts
    When I send invalid GET HTTP request OtherProducts
    Then I receive valid HTTP response code 404

  @GetProductByIdCust
  Scenario: GET - Product by Id Cust (positive)
    Given I set GET endpoints Product by Id Cust
    When I send GET HTTP request Product by Id Cust
    Then I receive valid HTTP response code 200
  @GetProductById
  Scenario: GET - Product by Id with invalid endpoint (negative)
    Given I set invalid GET endpoints Product by Id Cust
    When I send invalid GET HTTP request Product by Id Cust
    Then I receive valid HTTP response code 404