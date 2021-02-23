@apiTest2, @apiTests
Feature: To verify if user is authorised to login to reqres site
  Scenario: To verify the given user is authorised using POST method
    Given I want to enter the credentials
    When I submit my details
    Then I should get logged in successful