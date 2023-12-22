#Feature: Article
#  As a user
#  I want to access articles
#  So that I can manage articles
#
#  @GetAllArticle
#  Scenario: GET - All Articles (positive)
#    Given I set GET endpoints All Articles
#    When I send GET HTTP request All Articles
#    Then I receive valid HTTP response code 200
#  @GetAllArticle
#  Scenario: GET - All Articles with invalid endpoint (negative)
#    Given I set invalid GET endpoints All Articles
#    When I send invalid GET HTTP request All Articles
#    Then I receive valid HTTP response code 404
##  @GetAllArticle
##  Scenario: GET - All Articles with invalid case forbidden (negative)
##    Given I set GET endpoints All Articles
##    When I send invalid GET HTTP request All Articles forbidden
##    Then I receive valid HTTP response code 401
#
#  @GetArticleById
#  Scenario: GET - Article by Id (positive)
#    Given I set GET endpoints Article by Id
#    When I send GET HTTP request Article by Id
#    Then I receive valid HTTP response code 200
#  @GetArticleById
#  Scenario: GET - Article by Id with invalid endpoint (negative)
#    Given I set invalid GET endpoints Article by Id
#    When I send invalid GET HTTP request Article by Id
#    Then I receive valid HTTP response code 404
#
#  @PostCreateArticle
#  Scenario: POST - Create an Article with valid endpoints (positive)
#    Given I set POST endpoints Article
#    When I send POST HTTP request Article
#    Then I receive valid HTTP response code 201
#
#  @PutUpdateArticle
#  Scenario: Put - An update Article with valid endpoint (positive)
#    Given I set PUT endpoints update Article
#    When I send PUT HTTP request update Article
#    Then I receive valid HTTP response code 200
#
#  @DeleteArticle
#  Scenario: DELETE- Delete Article with valid endpoint (positive)
#    Given I set DELETE endpoints delete Article
#    When I send DELETE HTTP request delete Article
#    Then I receive valid HTTP response code 200
