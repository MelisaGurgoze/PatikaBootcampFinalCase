Feature:Login Functions

  @appium
  Scenario:Login whit the email and password
    Given User opens Quick Rent App
    When User fills  email address as"deneme@hotmail.com"
    When User fills password ad "patika123"
    When User clicks login button
    Then Redirect to home page

