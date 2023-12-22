#Feature: Voucher
#  As an user
#  I want to access voucher
#  So that I can manage voucher
#
#  @GetAllVoucher
#  Scenario: GET - All Voucher (positive)
#    Given I set GET endpoints All Voucher
#    When I send GET HTTP request All Voucher
#    Then I receive valid HTTP response code 200
#  @GetAllVoucher
#  Scenario: GET - All Voucher with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Voucher
#    When I send invalid GET HTTP request All Voucher
#    Then I receive valid HTTP response code 404
#  @GetAllVoucher
#  Scenario: GET - All Voucher with invalid case forbidden (negative)
#    Given I set GET endpoints All Voucher
#    When I send invalid GET HTTP request All Voucher forbidden
#    Then I receive valid HTTP response code 401
#
#  @GetVoucherById
#  Scenario: GET - Voucher by Id (positive)
#    Given I set GET endpoints Voucher by Id
#    When I send GET HTTP request Voucher by Id
#    Then I receive valid HTTP response code 200
#  @GetVoucherById
#  Scenario: GET - Voucher by Id with invalid endpoint (negative)
#    Given I set invalid GET endpoints Voucher by Id
#    When I send invalid GET HTTP request Voucher by Id
#    Then I receive valid HTTP response code 404
#
#  @PostCreateVoucher
#  Scenario: POST - Create a Voucher with valid endpoints (positive)
#    Given I set POST endpoints Voucher
#    When I send POST HTTP request Voucher
#    Then I receive valid HTTP response code 201
#
#  @PutUpdateVoucher
#  Scenario: Put - An update Voucher with valid endpoint (positive)
#    Given I set PUT endpoints update Voucher
#    When I send PUT HTTP request update Voucher
#    Then I receive valid HTTP response code 200
#
#  @DeleteVoucher
#  Scenario: DELETE- Delete voucher with valid endpoint (positive)
#    Given I set DELETE endpoints delete voucher
#    When I send DELETE HTTP request delete voucher
#    Then I receive valid HTTP response code 200
#
