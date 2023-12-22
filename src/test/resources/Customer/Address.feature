#Feature: Address Management
#  As a user
#  I want to retrieve all addresses, create, update, and delete addresses
#  So that I can manage my address information
#
#  @GetAllAddress
#  Scenario: GET - All Addresses (positive)
#    Given I set GET endpoints for All Addresses
#    When I send GET HTTP request for All Addresses
#    Then I receive a valid HTTP response code 200
#
#  @GetAllAddressInvalid
#  Scenario: GET - All Addresses with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for All Addresses
#    When I send invalid GET HTTP request for All Addresses
#    Then I receive a valid HTTP response code 404
#
#  @CreateAddress
#  Scenario: POST - Create Address (positive)
#    Given I set POST endpoints for creating an Address
#    When I send POST HTTP request to create an Address
#    Then I receive a valid HTTP response code 201
#
#  @CreateAddressInvalid
#  Scenario: POST - Create Address with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for creating an Address
#    When I send invalid POST HTTP request for creating an Address
#    Then I receive a valid HTTP response code 404
#
#  @UpdateAddress
#  Scenario: PUT - Update Address (positive)
#    Given I set PUT endpoints for updating an Address
#    When I send PUT HTTP request to update an Address
#    Then I receive a valid HTTP response code 200
#
#  @UpdateAddressInvalid
#  Scenario: PUT - Update Address with Invalid Endpoint (negative)
#    Given I set invalid PUT endpoints for updating an Address
#    When I send invalid PUT HTTP request for updating an Address
#    Then I receive a valid HTTP response code 404
#
#  @DeleteAddress
#  Scenario: DELETE - Delete Address (positive)
#    Given I set DELETE endpoints for deleting an Address
#    When I send DELETE HTTP request to delete an Address
#    Then I receive a valid HTTP response code 200
#
#  @DeleteAddressInvalid
#  Scenario: DELETE - Delete Address with Invalid Endpoint (negative)
#    Given I set invalid DELETE endpoints for deleting an Address
#    When I send invalid DELETE HTTP request for deleting an Address
#    Then I receive a valid HTTP response code 404
