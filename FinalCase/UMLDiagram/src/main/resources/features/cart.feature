//UML Diagram scenario 2/20

Feature:Cart Page Tests

  Scenario: Add car to cart for reservation
    Given User clicks cars button
    When User navigates to cars list page
    When User selects car and click details button
    When User navigates to car details page
    When User clicks  make reservation button
    When User navigates to make reservation page
    When User selects dates
    When User selects location
    When User clicks  add carts button
    Then User navigates to carts page

  Scenario: Make Reservation
    Given User clicks cars button
    When User navigates to cars list page
    When User selects car and click details button
    When User navigates to car details page
    When User clicks  make reservation button
    When User navigates to make reservation page
    When User selects dates
    When User selects location
    When User clicks  add carts button
    When User navigates to carts page
    When clicks pay button
    When navigates Payment page
    When fills credit card numbers
    When fills CVV
    Then clicks pay button
    Then Return success message
