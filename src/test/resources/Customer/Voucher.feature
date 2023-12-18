Feature: Voucher
  As an user
  I want to access voucher
  So that I can manage Use and Redeem coucher

  @GetVoucherUser
  Scenario: GET - Voucher User (positive)
    Given I set GET endpoints Voucher User
    When I send GET HTTP request Voucher User
    Then I receive valid HTTP response code 200
  @GetVoucherUser
  Scenario: GET - Voucher User with invalid endpoint (negative)
    Given I set invalid GET endpoints Voucher User
    When I send invalid GET HTTP request Voucher User
    Then I receive valid HTTP response code 405
  @GetVoucherUser
  Scenario: GET - Voucher User with invalid case forbidden (negative)
    Given I set GET endpoints Voucher User
    When I send invalid GET HTTP request Voucher User forbidden
    Then I receive valid HTTP response code 401

  @GetVoucherToClaims
  Scenario: GET - Voucher To Claims (positive)
    Given I set GET endpoints Voucher To Claims
    When I send GET HTTP request Voucher To Claims
    Then I receive valid HTTP response code 200
  @GetVoucherToClaims
  Scenario: GET - Voucher To Claims with invalid endpoint (negative)
    Given I set invalid GET endpoints Voucher To Claims
    When I send invalid GET HTTP request Voucher To Claims
    Then I receive valid HTTP response code 405

  @PostClaimsVoucher
  Scenario: POST - Claims Voucher with valid endpoints (positive)
    Given I set POST endpoints Claims Voucher
    When I send POST HTTP request Claims Voucher
    Then I receive valid HTTP response code 200