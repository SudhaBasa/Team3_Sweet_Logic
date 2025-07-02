@tag
Feature: Subscription page validation

  Background: User completes onboarding process
    Given User is in last step for onboarding process

  @tag1
  Scenario: Verify Daily Meal Plan availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Both Free and Premium should show Daily Meal Plan as available

  @tag2
  Scenario: Verify Weekly Meal Plan availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Weekly Meal Plan should be available only in Premium

  Scenario: Verify Personalized Exercise Plan availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Personalized Exercise Plan should be available only in Premium

  Scenario: Verify 10-Day Quick Reversal Plan availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then 10-Day Quick Reversal Plan should be available only in Premium

  Scenario: Verify 30-Day Blood Sugar Reduction Plan
    Given User is in last step for onboarding process
    When User clicks submit button
    Then 30-Day Blood Sugar Reduction Plan should be available only in Premium

  Scenario: Verify Glucose Level Graph availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Both Free and Premium should show Glucose Level Graph as available

  Scenario: Verify BMI Calculation availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Both Free and Premium should show BMI Calculation as available

  Scenario: Verify Downloadable Meal Plan PDF availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Downloadable Meal Plan PDF should be available only in Premium

  Scenario: Verify Reminders availability
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Reminders should be available only in Premium

  Scenario: Verify Go for free button is visible
    Given User is in last step for onboarding process
    When User clicks submit button
    Then The "Go for free" button should be visible

  Scenario: Verify Upgrade to Premium button is visible
    Given User is in last step for onboarding process
    When User clicks submit button
    Then The "Upgrade to Premium" button should be visible

  Scenario: Verify Free Account label and price
    Given User is in last step for onboarding process
    When User clicks submit button
    Then It should display "Free Account" with "$0 /month"

  Scenario: Verify Premium Account label and price
    Given User is in last step for onboarding process
    When User clicks submit button
    Then It should display "Premium Account" with "$9.99 /month"

  Scenario: Verify unavailable features are marked with red X
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Features not included should have red X icons

  Scenario: Verify available features are marked with green tick
    Given User is in last step for onboarding process
    When User clicks submit button
    Then All included features should have green checkmarks

  Scenario: Verify total number of features listed
    Given User is in last step for onboarding process
    When User clicks submit button
    Then It should list exactly 9 features

  Scenario: Verify position of Go for free button
    Given User is in last step for onboarding process
    When User clicks submit button
    Then The "Go for free" button should appear under the Free column

  Scenario: Verify position of Upgrade to Premium button
    Given User is in last step for onboarding process
    When User clicks submit button
    Then The "Upgrade to Premium" button should appear under the Premium column

  Scenario: Verify terms and conditions text is visible
    Given User is in last step for onboarding process
    When User clicks submit button
    Then Terms & Conditions and Privacy Policy text should be visible

  Scenario: Verify upgrade message header is displayed
    Given User is in last step for onboarding process
    When User clicks submit button
    Then It should show the text “Upgrade to premium for complete diabetes management”

  Scenario: Verify visual separation between Free and Premium plans
    Given User is in last step for onboarding process
    When User clicks submit button
    Then The Free and Premium plans should be displayed side-by-side in clearly separated columns
