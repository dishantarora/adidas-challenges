@tag
Feature: Demo Pet Store
  API automated checks over Demo Pet Store: https://petstore.swagger.io/

  @tag1
  Scenario: Get available pets
    Given I set get API endpoint
    When I sends the GET HTTP request
    Then I receive valid HTTP resposne code 201
    And response body
