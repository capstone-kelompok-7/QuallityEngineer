Feature: Carousel
  As an user
  I want to login
  So that I can manage carousel

  @GetAllCarousel
  Scenario: GET - All Carousel (positive)
    Given I set GET endpoints All Carousel
    When I send GET HTTP request All Carousel
    Then I receive valid HTTP response code 200
  @GetAllCarousel
  Scenario: GET - All Carousel with invalid endpoint (negative)
    Given I set invalid GET endpoints All Carousel
    When I send invalid GET HTTP request All Carousel
    Then I receive valid HTTP response code 404
  @GetAllCarousel
  Scenario: GET - All Carousel with invalid case forbidden (negative)
    Given I set GET endpoints All Carousel
    When I send invalid GET HTTP request All Carousel forbidden
    Then I receive valid HTTP response code 401

  @GetCarouselById
  Scenario: GET - Carousel by Id (positive)
    Given I set GET endpoints Carousel by Id
    When I send GET HTTP request Carousel by Id
    Then I receive valid HTTP response code 200
  @GetCarouselById
  Scenario: GET - Carousel by Id with invalid endpoint (negative)
    Given I set invalid GET endpoints Carousel by Id
    When I send invalid GET HTTP request Carousel by Id
    Then I receive valid HTTP response code 404

  @PostCreateCarousel
  Scenario: POST - Create a Carousel with valid endpoints (positive)
    Given I set POST endpoints Carousel
    When I send POST HTTP request Carousel
    Then I receive valid HTTP response code 201

  @PutUpdateCarousel
  Scenario: PUT - Update a Carousel with valid endpoints (positive)
    Given I set PUT endpoints Carousel
    When I send PUT HTTP request Carousel
    Then I receive valid HTTP response code 200