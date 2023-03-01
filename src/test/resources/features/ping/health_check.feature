Feature:  API Ping Endpoint

  Scenario: Successful Ping
    Given  a user makes an API request
    When  the user sends a GET request to /ping
    Then the response code should be 201

