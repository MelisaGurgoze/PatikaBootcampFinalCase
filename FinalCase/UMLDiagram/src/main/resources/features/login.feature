//UML Diagram scenario 4/20

Feature: Login Process

  Scenario: Login should return fail when user null
    Given User opens Quick Rent App
    When User clicks login button
    Then Return error message

  Scenario: Login should return fail when user invalid
    Given User opens Quick Rent App
    When User fills invalid email address
    When User fills invalid password
    When User clicks login button
    Then Return error message


  Scenario:Login Quick Rent App
    Given User opens Quick Rent App
    When User fills  email address
    When User fills password
    When User clicks login button

  Scenario: Two step verification
    Given User opens Quick Rent App
    When User fills  email address
    When User fills password
    When User clicks login button
    When Send  code with  e-mail for verification
    When Open pop-up for enter verification code
    When User fills input with the verification code
    Then Redirect to home page


  Scenario:Search box control
    Given User fills search box with car name
    When User clicks on searching button
    Then User navigates to searching car page
