#Feature: Article Management and Personalization
#  As a user
#  I want to personalize articles, view other articles, access the latest articles, view an article by ID, bookmark articles, and manage my bookmarked articles
#  So that I can read and manage articles based on my preferences
#
#  @GetPersonalizeArticle
#  Scenario: GET - Personalized Article (positive)
#    Given I set GET endpoints for retrieving personalized articles
#    When I send GET HTTP request for retrieving personalized articles
#    Then I receive a valid HTTP response code 200
#
#  @GetPersonalizeArticleInvalid
#  Scenario: GET - Personalized Article with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving personalized articles
#    When I send invalid GET HTTP request for retrieving personalized articles
#    Then I receive a valid HTTP response code 404
#
#  @GetOtherArticle
#  Scenario: GET - Other Article (positive)
#    Given I set GET endpoints for retrieving other articles
#    When I send GET HTTP request for retrieving other articles
#    Then I receive a valid HTTP response code 200
#
#  @GetOtherArticleInvalid
#  Scenario: GET - Other Article with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving other articles
#    When I send invalid GET HTTP request for retrieving other articles
#    Then I receive a valid HTTP response code 404
#
#  @GetLatestArticle
#  Scenario: GET - Latest Article (positive)
#    Given I set GET endpoints for retrieving the latest articles
#    When I send GET HTTP request for retrieving the latest articles
#    Then I receive a valid HTTP response code 200
#
#  @GetLatestArticleInvalid
#  Scenario: GET - Latest Article with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving the latest articles
#    When I send invalid GET HTTP request for retrieving the latest articles
#    Then I receive a valid HTTP response code 404
#
#  @GetArticleById
#  Scenario: GET - Article By Id (positive)
#    Given I set GET endpoints for retrieving an article by ID
#    When I send GET HTTP request for retrieving an article by ID
#    Then I receive a valid HTTP response code 200
#
#  @GetArticleByIdInvalid
#  Scenario: GET - Article By Id with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving an article by ID
#    When I send invalid GET HTTP request for retrieving an article by ID
#    Then I receive a valid HTTP response code 404
#
#  @GetBookmarkArticleUser
#  Scenario: GET - Bookmark Article User (positive)
#    Given I set GET endpoints for retrieving bookmarked articles by the user
#    When I send GET HTTP request for retrieving bookmarked articles by the user
#    Then I receive a valid HTTP response code 200
#
#  @GetBookmarkArticleUserInvalid
#  Scenario: GET - Bookmark Article User with Invalid Endpoint (negative)
#    Given I set invalid GET endpoints for retrieving bookmarked articles by the user
#    When I send invalid GET HTTP request for retrieving bookmarked articles by the user
#    Then I receive a valid HTTP response code 404
#
#  @PostBookmarkArticle
#  Scenario: POST - Bookmark Article (positive)
#    Given I set POST endpoints for bookmarking an article
#    When I send POST HTTP request for bookmarking an article
#    Then I receive a valid HTTP response code 201
#
#  @PostBookmarkArticleInvalid
#  Scenario: POST - Bookmark Article with Invalid Endpoint (negative)
#    Given I set invalid POST endpoints for bookmarking an article
#    When I send invalid POST HTTP request for bookmarking an article
#    Then I receive a valid HTTP response code 404
#
#  @DelBookmarkArticle
#  Scenario: DELETE - Delete Bookmark Article (positive)
#    Given I set DELETE endpoints for deleting a bookmarked article
#    When I send DELETE HTTP request for deleting a bookmarked article
#    Then I receive a valid HTTP response code 200
#
#  @DelBookmarkArticleInvalid
#  Scenario: DELETE - Delete Bookmark Article with Invalid Endpoint (negative)
#    Given I set invalid DELETE endpoints for deleting a bookmarked article
#    When I send invalid DELETE HTTP request for deleting a bookmarked article
#    Then I receive a valid HTTP response code 404
