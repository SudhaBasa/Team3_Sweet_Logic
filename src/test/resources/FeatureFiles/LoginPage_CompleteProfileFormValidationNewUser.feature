Feature: Complete Profile Form validation for new user

  Background: User is on login page after clicking login in launch page
  Given  User is on the login page
  Scenario: Verify Full Name field is visible
    Given User is on the login page
    When User clicks continue with email button after entering a valid new email
    Then "Full Name" input field should be displayed

  @tag2
  Scenario: Verify Username field is visible
    Given User is on the login page
    When User clicks continue with email button after entering a valid new email
    Then "Username" input field should be displayed

  Scenario: Verify Password field is visible
    Given User is on the login page
    When User clicks continue with email button after entering a valid new email
    Then "Password" input field should be displayed

  Scenario: Verify Terms & Conditions checkbox is visible
    Given User is on the login page
    When User clicks continue with email button after entering a valid new email
    Then Terms & Conditions checkbox should be displayed

  Scenario: Verify Create Account button is disabled initially
    Given User is on the login page
    When User clicks continue with email button after entering a valid new email
    Then "Create Account" button should be disabled
