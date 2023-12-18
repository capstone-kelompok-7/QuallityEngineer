Feature: Reviews
  As an user
  I want to access Reviews
  So that I can manage Add Reviews

  @PostCreateReviews
  Scenario: POST - Create a Reviews with valid endpoints (positive)
    Given I set POST endpoints Reviews
    When I send POST HTTP request Reviews
    Then I receive valid HTTP response code 201
  @PostCreateReviews
  Scenario: POST - Create a Reviews with invalid endpoint (negative)
    Given I set invalid POST endpoints Reviews
    When I send invalid POST HTTP request Reviews
    Then I receive valid HTTP response code 404