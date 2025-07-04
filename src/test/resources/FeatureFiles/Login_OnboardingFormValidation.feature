Feature: Onboarding Form Validation

  Background: 
   Given User successfully uploaded blood report


  Scenario: Verify presence of text field
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should see text field for Age, height, weight

  Scenario: Verify presence of dropdown
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should dropdown option for Gender field

  Scenario: Verify dropdown text for gender
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should see "Male, female, prefer not to say" options in dropdown

  Scenario: Verify presence of continue button
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should see enabled "Continue" button

  Scenario: Verify navigation for step 1 onboarding
    Given User is on report analysis
    When User clicks Onboarding button
    Then User should move to step 2

  Scenario: Validate error message for invalid input
    Given User is on report analysis
    When User enters invalid values in the form
    Then User should receive error message if form has invalid values

  Scenario: Verify progress bar is visible
    Given User is on report analysis
    When User clicks Onboarding button
    Then Progress bar should be visible

  Scenario: Verify progress shows 1 of 5 steps
    Given User is on report analysis
    When User clicks Onboarding button
    Then Progress text should read Step 1 of 5

  Scenario: Verify step 1 progress is highlighted
    Given User is on report analysis
    When User clicks Onboarding button
    Then Step 1 indicator should be highlighted

  Scenario: Verify incomplete steps (2-5) are not highlighted
    Given User is on report analysis
    When User clicks Onboarding button
    Then Steps 2 to 5 should remain unhighlighted/inactive
