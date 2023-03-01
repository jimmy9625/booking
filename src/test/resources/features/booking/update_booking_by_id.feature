Feature: update feature

  Scenario Outline: Successful Booking Update
    Given  a user makes an API request
    When  the user sends a PUT request to /booking with the <id> of the booking to be updated and the updated booking information
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | Jane      | Doe      | 111        | true        | 2018-01-01 | 2019-01-01 | Extra pillows please |
    Then the response code should be 200
    And the user should see the updated booking information in the response body
    Examples:
      | id |
      | 1  |


  Scenario Outline: Successful Booking Update
    Given  a user makes an API request
    When  the user sends a PUT request to /booking with the <id> of the booking to be updated and the updated booking information
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | Jane      | Doe      | 111        | true        | 2018-01-01 | 2019-01-01 | Extra pillows please |
    Then the response code should be 405
    Examples:
      | id      |
      | 1222122 |



