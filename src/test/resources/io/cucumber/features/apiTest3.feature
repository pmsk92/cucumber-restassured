@apiTest3, @apiTests
Feature: To verify if user is available in the reqres site
  Scenario: To verify the given user is available in the database using GET method
    Given I want to enter the request for user
    When I submit my request of user2
    Then I should get successful response