Feature: Auth
  As an user
  I want to login
  So that I can access using my account

  @Login
  Scenario: POST - Login account (positive)
    Given I set POST endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200
  @Login
  Scenario: POST - Login account with invalid endpoints (negative)
    Given I set POST invalid endpoints login
    When I send invalid POST HTTP request login
    Then I receive valid HTTP response code 404

  @Login
  Scenario: POST - Login failed case error validating (negative)
    Given I set POST endpoints login
    When I send invalid POST HTTP request login error validating
    Then I receive valid HTTP response code 400

  @Login
  Scenario: POST - Login failed case user not found (negative)
    Given I set POST endpoints login
    When I send invalid POST HTTP request login user not found
    Then I receive valid HTTP response code 404

  @Login
  Scenario: POST - Login failed case error binding (negative)
    Given I set POST endpoints login
    When I send invalid POST HTTP request login error binding
    Then I receive valid HTTP response code 400

  @Login
  Scenario: POST - Login failed case invalid credential (negative)
    Given I set POST endpoints login
    When I send invalid POST HTTP request login invalid credential
    Then I receive valid HTTP response code 400

  @Login
  Scenario: POST - Login failed case account not verified (negative)
    Given I set POST endpoints login
    When I send invalid POST HTTP request login account not verified
    Then I receive valid HTTP response code 400