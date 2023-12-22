#Feature: Content Management
#  As a user
#  I want to access carousels, categories, and blog spots
#  So that I can view and interact with various types of content
#
#  @GetCarouselCategory
#  Scenario: GET - Carousel, Category (positive)
#    Given I set GET endpoints for retrieving carousels and categories
#    When I send GET HTTP request for retrieving carousels and categories
#    Then I receive a valid HTTP response code 200
#
#  @GetCarouselCategoryInvalid
#  Scenario: GET - Carousel, Category with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving carousels and categories
#    When I send invalid GET HTTP request for retrieving carousels and categories
#    Then I receive a valid HTTP response code 404
#
#  @GetBlogSpot
#  Scenario: GET - Blog Spot (positive)
#    Given I set GET endpoints for retrieving blog spots
#    When I send GET HTTP request for retrieving blog spots
#    Then I receive a valid HTTP response code 200
#
#  @GetBlogSpotInvalid
#  Scenario: GET - Blog Spot with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving blog spots
#    When I send invalid GET HTTP request for retrieving blog spots
#    Then I receive a valid HTTP response code 404
