@tag
Feature: Profile form verification

  Background: User clicks continue with email button after entering a valid new email

  @tag1
  Scenario: Verify Create Account button is enabled after valid input
    Given User is on complete profile form page
    When User checks the Terms & conditions box after filling all fields
    Then "Create Account" button should be enabled

  Scenario: Verify Create account form  with valid data
    Given User is on complete profile form page
    When User clicks create account button after filling valid data in all fields
    Then User should redirected to upload blood report

  Scenario: Verify Create account form  with invalid data
    Given User is on complete profile form page
    When User clicks create account button after filling invalid data
    Then User should see error message

  Scenario: Verify presence of Upload Blood Report button
    Given User is on complete profile form page
    When User clicks create account button after filling valid data in all fields
    Then User should see Upload Blood Report button

  Scenario: Verify presence of Step Through Onboarding button
    Given User is on complete profile form page
    When User clicks create account button after filling valid data in all fields
    Then User should see Step Through Onboarding button
