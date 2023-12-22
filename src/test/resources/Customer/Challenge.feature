#Feature: Challenge Management
#  As a user
#  I want to view all challenges, view a challenge by ID, and submit a form for a challenge
#  So that I can manage my challenge-related information
#
#  @GetAllChallenge
#  Scenario: GET - All Challenges (positive)
#    Given I set GET endpoints for retrieving all challenges
#    When I send GET HTTP request for retrieving all challenges
#    Then I receive a valid HTTP response code 200
#
#  @GetAllChallengeInvalid
#  Scenario: GET - All Challenges with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving all challenges
#    When I send invalid GET HTTP request for retrieving all challenges
#    Then I receive a valid HTTP response code 404
#
#  @GetChallengeById
#  Scenario: GET - Challenge By Id (positive)
#    Given I set GET endpoints for retrieving a challenge by ID
#    When I send GET HTTP request for retrieving a challenge by ID
#    Then I receive a valid HTTP response code 200
#
#  @GetChallengeByIdInvalid
#  Scenario: GET - Challenge By Id with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving a challenge by ID
#    When I send invalid GET HTTP request for retrieving a challenge by ID
#    Then I receive a valid HTTP response code 404
#
#  @PostCreateSubmitFormChallenge
#  Scenario: POST - Create Submit Form for Challenge (positive)
#    Given I set POST endpoints for creating a submit form for a challenge
#    When I send POST HTTP request for creating a submit form for a challenge
#    Then I receive a valid HTTP response code 201
#
#  @PostCreateSubmitFormChallengeInvalid
#  Scenario: POST - Create Submit Form for Challenge with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for creating a submit form for a challenge
#    When I send invalid POST HTTP request for creating a submit form for a challenge
#    Then I receive a valid HTTP response code 404
