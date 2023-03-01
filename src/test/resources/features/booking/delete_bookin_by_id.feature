Feature: Delete booking

  Scenario Outline: delete booking succes
    Given  a user makes an API request
    When the user sends a DELETE request to /booking with booking ID <id>
    Then the response code should be 201


    Examples:
      | id   |
      | 1126 |

  Scenario Outline: Unsuccessful delete booking
    Given a user makes an API request
    When the user sends a DELETE request to /booking with an invalid booking ID <id>
    Then the response code should be 405

    Examples:
      | id     |
      | 999999 |