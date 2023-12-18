Feature: Auth
  As an user
  I want to login
  So that I can access using my account

  @Register
  Scenario: POST - Register (positive)
    Given I set POST endpoints Register
    When I send POST HTTP request Register
    Then I receive valid HTTP response code 200
  @Register
  Scenario: POST - Register with invalid endpoints (negative)
    Given I set POST invalid endpoints Register
    When I send invalid POST HTTP request Register
    Then I receive valid HTTP response code 404

  @LoginCustomer
  Scenario: POST - Login account customer (positive)
    Given I set POST endpoints login customer
    When I send POST HTTP request login customer
    Then I receive valid HTTP response code 200
  @LoginCustomer
  Scenario: POST - Login account customer with invalid endpoints (negative)
    Given I set POST invalid endpoints login customer
    When I send invalid POST HTTP request login customer
    Then I receive valid HTTP response code 404

  @ResendOTP
  Scenario: POST - Resend OTP (positive)
    Given I set POST endpoints resend OTP
    When I send POST HTTP request resend OTP
    Then I receive valid HTTP response code 200
  @ResendOTP
  Scenario: POST - Login account with invalid endpoints (negative)
    Given I set POST invalid resend OTP
    When I send invalid POST HTTP resend OTP
    Then I receive valid HTTP response code 404