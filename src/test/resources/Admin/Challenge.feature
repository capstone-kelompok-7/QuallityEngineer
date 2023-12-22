Feature: Challenge
  As a user
  I want to access challenges
  So that I can manage challenges

  @GetAllChallenge
  Scenario: GET - All Challenges (positive)
    Given I set GET endpoints All Challenges
    When I send GET HTTP request All Challenges
    Then I receive valid HTTP response code 200
  @GetAllChallenge
  Scenario: GET - All Challenges with invalid endpoint (negative)
    Given I set invalid GET endpoints All Challenges
    When I send invalid GET HTTP request All Challenges
    Then I receive valid HTTP response code 404

  @GetChallengeById
  Scenario: GET - Challenge by Id (positive)
    Given I set GET endpoints Challenge by Id
    When I send GET HTTP request Challenge by Id
    Then I receive valid HTTP response code 200
  @GetChallengeById
  Scenario: GET - Challenge by Id with invalid endpoint (negative)
    Given I set invalid GET endpoints Challenge by Id
    When I send invalid GET HTTP request Challenge by Id
    Then I receive valid HTTP response code 404

  @PostCreateChallenge
  Scenario: POST - Create a Challenge with valid endpoints (positive)
    Given I set POST endpoints Challenge
    When I send POST HTTP request Challenge
    Then I receive valid HTTP response code 201

  @PutUpdateChallenge
  Scenario: Put - An update Challenge with valid endpoint (positive)
    Given I set PUT endpoints update Challenge
    When I send PUT HTTP request update Challenge
    Then I receive valid HTTP response code 200

  @DeleteChallenge
  Scenario: DELETE- Delete Challenge with valid endpoint (positive)
    Given I set DELETE endpoints delete Challenge
    When I send DELETE HTTP request delete Challenge
    Then I receive valid HTTP response code 200