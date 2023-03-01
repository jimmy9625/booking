Feature: Booking Retrieval by ID

  Scenario Outline: get booking succes
    Given  a user makes an API request
    When the user sends a GET request to /booking with the <id> of the booking
    Then the response code should be 200
    And  Confirm the  information is correct in response body
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | Jane      | Doe      | 111        | true        | 2018-01-01 | 2019-01-01 | Extra pillows please |
    Examples:
      | id |
      | 11 |


  Scenario Outline: get booking unsucces
    Given  a user makes an API request
    When  the user sends a GET request to /booking with an invalid <id>
    Then the response code should be 404
    Examples:
      | id     |
      | 112222 |
