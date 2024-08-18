//UML Diagram scenario 2/20

Feature:Register Process

Scenario:Register app
Given User opens Quick Rent App
When clicks Sing up button
When User fills name
When User fills surname
When User fills  email address
When User fills password
When User fills identity number
When fills phone number
When checks Agree with Terms &Condition checkbox
When User clicks Register button
When Return success message
Then Redirect login page

Scenario: Login should return fail when user invalid
Given User opens Quick Rent App
When User clicks register button
Then Return error message
