//UML Diagram scenario 6/20

Feature: Home page Process

  Scenario: List cars
    Given User clicks cars button
    Then Users navigates to cars page


  Scenario:Admin add new car
    Given Admin clicks cars button
    When Admin add button
    When Redirect add car page
    When Admin fills car features inputs
    When Admin add photography button
    When Admin clicks save button
    Then Redirect cars page


  Scenario:Admin add new car
    Given Admin clicks cars button
    When Admin add button
    When Redirect add car page
    When Admin fills car features inputs
    When Admin add photography button
    When Admin clicks save button
    Then Redirect cars page

  Scenario:Delete car
    Given Admin navigates to cars page
    When Admin select the car and click details button for selected car
    When Admin navigates to car details page
    When Admin clicks delete button
    Then Return success message

  Scenario:Make passive to car status
    Given Admin navigates to cars page
    When Admin select the car and click details button for selected car
    When Admin navigates to car details page
    When Admin check passive status checkbox
    Then Return success message

  Scenario:Update car photography
    Given Admin navigates to cars page
    When Admin selects the car and clicks details button for selected car
    When Admin navigates to car details page
    When Admin add new photography button
    When Admin select photography
    When Admin clicks add button
    When Admin clicks save changes button
    Then Return success message

