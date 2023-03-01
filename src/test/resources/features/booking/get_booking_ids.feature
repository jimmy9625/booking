Feature: Booking IDs Retrieval

  Scenario: Successful Booking IDs Retrieval
    Given  a user makes an API request
    When  the user sends a GET request to "/booking"
    Then the response code should be 200
    And  the user should receive a list of booking IDs in the response body


