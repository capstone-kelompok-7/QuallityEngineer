Feature: User
  As an user
  I want to access User
  So that I can manage User

  @GetAllUser
  Scenario: GET - All User (positive)
    Given I set GET endpoints All User
    When I send GET HTTP request All User
    Then I receive valid HTTP response code 200
  @GetAllUser
  Scenario: GET - All User with invalid endpoint (negative)
    Given I set invalid GET endpoints All User
    When I send invalid GET HTTP request All User
    Then I receive valid HTTP response code 404
  @GetAllUser
  Scenario: GET - All User with invalid case forbidden (negative)
    Given I set GET endpoints All User
    When I send invalid GET HTTP request All User forbidden
    Then I receive valid HTTP response code 401

  @GetUserById
  Scenario: GET - User by Id (positive)
    Given I set GET endpoints User by Id
    When I send GET HTTP request User by Id
    Then I receive valid HTTP response code 200
  @GetUserById
  Scenario: GET - User by Id with invalid case forbidden (negative)
    Given I set GET endpoints User by Id
    When I send invalid GET HTTP request User by Id forbidden
    Then I receive valid HTTP response code 401

  @GetActivityById
  Scenario: GET - Activity by Id (positive)
    Given I set GET endpoints Activity by Id
    When I send GET HTTP request Activity by Id
    Then I receive valid HTTP response code 200
  @GetActivityById
  Scenario: GET - Activity by Id with invalid case forbidden (negative)
    Given I set GET endpoints Activity by Id
    When I send invalid GET HTTP request Activity by Id forbidden
    Then I receive valid HTTP response code 401

  @DeleteUser
  Scenario: DELETE- Delete User with valid endpoint (positive)
    Given I set DELETE endpoints delete User
    When I send DELETE HTTP request delete User
    Then I receive valid HTTP response code 200