#Feature: Reviews
#  As an user
#  I want to access Reviews
#  So that I can manage Reviews
#
#  @GetAllReviews
#  Scenario: GET - All Reviews (positive)
#    Given I set GET endpoints All Reviews
#    When I send GET HTTP request All Reviews
#    Then I receive valid HTTP response code 200
#  @GetAllReviews
#  Scenario: GET - All Reviews with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Reviews
#    When I send invalid GET HTTP request All Reviews
#    Then I receive valid HTTP response code 404
#  @GetAllReviews
#  Scenario: GET - All Reviews with invalid case forbidden (negative)
#    Given I set GET endpoints All Reviews
#    When I send invalid GET HTTP request All Product forbidden
#    Then I receive valid HTTP response code 401
#
#  @GetReviewsById
#  Scenario: GET - Reviews by Id (positive)
#    Given I set GET endpoints Reviews by Id
#    When I send GET HTTP request Reviews by Id
#    Then I receive valid HTTP response code 200
#  @GetReviewsById
#  Scenario: GET - Reviews by Id with invalid endpoint (negative)
#    Given I set invalid GET endpoints Reviews by Id
#    When I send invalid GET HTTP request Reviews by Id
#    Then I receive valid HTTP response code 404
#  @GetReviewsById
#  Scenario: GET - Reviews by Id with invalid case forbidden (negative)
#    Given I set GET endpoints Reviews by Id
#    When I send invalid GET HTTP request Reviews by Id forbidden
#    Then I receive valid HTTP response code 401