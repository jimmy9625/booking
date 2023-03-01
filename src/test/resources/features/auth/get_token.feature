Feature:  Authentication Token Retrieval

  Scenario Outline: Successful Token Retrieval
    Given  a user makes an API request
    When the user sends a POST request to /auth  with their <userName> and <password>
    Then the response code should be 200
    And  the  response body contains "token"
    Examples:
      | userName | password    |
      | admin    | password123 |

  Scenario Outline: get token unsucces token
    Given  a user makes an API request
    When the user sends a POST request to /auth  with their <userName> and <password>
    Then the response code should be 200
    And   the response message should be Bad credentials
    Examples:
      | userName | password    |
      | almin    | password123 |
