Feature: Booking Creation

  Scenario: Successful Booking Creation
    Given  a user makes an API request
    When  the user sends a POST request to /booking with the following information:
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds      |
      | Jane      | Doe      | 111        | true        | 2018-01-01 | 2019-01-01 | Extra pillows please |
    Then the response code should be 200
    And the user should receive a response body containing the booking information

