Feature: Database foreign keys and columns verification

  Scenario:
    Given User has User_Role_Assignments  table
    When User add a person
    When User table has user_id is filled fk
    Then User has role_id column in User_Role_Assignments table fk


Feature: Database primary keys and columns verification

  Scenario:
    Given User has User  table
    When User add a person
    When User table has user_id is filled
    Then User has user_id column pk

Feature: User Role Relationship Database Test

  Scenario: User should be correctly linked to a role using a foreign key
    Given A role with id "1" and name "Admin" exists in the roles table
    When No user with email "userwithrole@example.com" exists in the users table
    When User registers with email "userwithrole@example.com", password "SecurePassword123", and role_id "1"
    When User record with email "userwithrole@example.com" should be found in the database
    When  role_id for "userwithrole@example.com" should be "1"
    When  role with id "1" should exist in the roles table
    Then  user with email "userwithrole@example.com" should have a valid foreign key relationship with the role table

Feature: Data Type Validation for User Registration

  Scenario: Ensure data types are correctly enforced
    Given No user with email "datavalidation@example.com" exists in the database
    When User registers with email "deneme@example.com", password "patika123", first name "Admin", last name "Test", phone number "+9876543210", TC ID number "12345678912", and birthdate "1997-07-28"
    When User record with email "deneme@example.com" should be found in the database
    When Email should be a VARCHAR(255)
    When Password should be a VARCHAR(255) and correctly hashed
    When First name should be a VARCHAR(100)
    When Last name should be a VARCHAR(100)
    When Phone number should be a VARCHAR(15)
    When Identity_number should be a VARCHAR(20)
    Then Birthdate should be a DATE
