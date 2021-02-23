@apiTest1, @apiTests
Feature: To verify api automation with REST assured in reqres.in site
  Scenario: To verify the users available using GET method
    Given I want to execute the GetUsers end point
    When I submit the request
    Then I should get 200 response