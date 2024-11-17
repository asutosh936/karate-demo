Feature: Sample API Test

  Scenario: Verify API response
    Given url 'https://jsonplaceholder.typicode.com/posts/1'
    When method GET
    Then status 200
    And match response contains { "id": 1 }
