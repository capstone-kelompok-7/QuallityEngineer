#Feature: Category
#  As an user
#  I want to access category
#  So that I can manage category
#
#  @GetAllCategory
#  Scenario: GET - All Category (positive)
#    Given I set GET endpoints All Category
#    When I send GET HTTP request All Category
#    Then I receive valid HTTP response code 200
#  @GetAllCategory
#  Scenario: GET - All Category with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Category
#    When I send invalid GET HTTP request All Category
#    Then I receive valid HTTP response code 404
#  @GetAllCategory
#  Scenario: GET - All Category with invalid case forbidden (negative)
#    Given I set GET endpoints All Category
#    When I send invalid GET HTTP request All Category forbidden
#    Then I receive valid HTTP response code 401
#
#  @GetCategoryById
#  Scenario: GET - Category by Id (positive)
#    Given I set GET endpoints Category by Id
#    When I send GET HTTP request Category by Id
#    Then I receive valid HTTP response code 200
#  @GetCategoryById
#  Scenario: GET - Category by Id with invalid endpoint (negative)
#    Given I set invalid GET endpoints Category by Id
#    When I send invalid GET HTTP request Category by Id
#    Then I receive valid HTTP response code 404
#  @GetCategoryById
#  Scenario: GET - Category by Id with invalid case forbidden (negative)
#    Given I set GET endpoints Category by Id
#    When I send invalid GET HTTP request Category by Id forbidden
#    Then I receive valid HTTP response code 401
#
#  @PostCreateCategory
#  Scenario: POST - Create a category with valid endpoints (positive)
#    Given I set POST endpoints categories
#    When I send POST HTTP request categories
#    Then I receive valid HTTP response code 201
#
#  @PutUpdateCategory
#  Scenario: PUT - Update a category with valid endpoints (positive)
#    Given I set PUT endpoints categories
#    When I send PUT HTTP request categories
#    Then I receive valid HTTP response code 200