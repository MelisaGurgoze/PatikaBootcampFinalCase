//UML Diagram scenario 6/20
Feature: Account Process

  Background:Login Quick Rent App
    Given User opens Quick Rent App
    When User fills  email address
    When User fills password
    When User clicks login button

  Scenario: Update user profile
    Given User clicks profile button
    When User clicks my profile button
    When User navigates profile page
    When User clicks edit button
    When User fills name
    When User fills surname
    When User fills e-mail
    When User fills phone number
    When User clicks Update button

  Scenario: Delete account
    Given User clicks profile button
    When User clicks my profile button
    When User clicks setting button
    When User navigates to setting page
    When User clicks delete account button
    When Open pop-up
    When User clicks sure button
    Then User navigates to login page

  Scenario:List reserved cars
    Given Admin clicks profile button
    When Admin clicks reservation management button
    When Admin navigates to reservation management page
    When Admin clicks list reservation button
    Then Admin navigates to list reservation page


  Scenario:List customers
    Given Admin clicks profile button
    When Admin clicks customer management button
    When Admin navigates to customer management page
    When Admin clicks list customer button
    Then Admin navigates to list customer page

  Scenario:List Customer details to make reservation
    Given Admin clicks profile button
    When Admin clicks customer management button
    When Admin navigates to customer management page
    When Admin clicks list customer button
    When Admin navigates to list customer page
    When Admin selects customer and clicks on it
    When Admin navigates to reservation details page

  Scenario: View reservation details
    Given User clicks profile button
    When User clicks my profile button
    When User navigates to profile page
    When User clicks my reservations button
    When User navigates to my reservations page
    When User selects a reservation and clicks details
    Then User navigates to reservation details page

