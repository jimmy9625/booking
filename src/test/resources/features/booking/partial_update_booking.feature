Feature: Partial Update booking

  Scenario Outline: Successful Partial Booking Update
    Given  a user makes an API request
    When  the user sends a PATCH request to /booking with the booking <id> and changes the <name> and <lastname> fields
    Then the response code should be 200
    And  the user should see the updated <name> and <lastname> fields in the booking

    Examples:
      | id | name    | lastname |
      | 1  | Juanito | Perez    |


  Scenario Outline: Unsuccessful Partial Update of Booking
    Given  a user makes an API request
    When  the user sends a PATCH request to /booking with the booking <id> and changes the <name> and <lastname> fields
    Then the response code should be 405

    Examples:
      | id      | name    | lastname |
      | 8888888 | Juanito | Perez    |

