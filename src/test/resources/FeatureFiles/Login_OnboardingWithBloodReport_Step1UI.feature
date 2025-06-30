Feature: Onboarding Step 1 UI

  Background: 
    User clicks onboarding button after reaching to report analysis


  Scenario: Verify Step 2 heading is visible
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then Page should display title: "Pick your pace: chill stroll or marathon magic"

  Scenario: Verify subtitle is visible
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then Page should show text: "Select your preferred exercise intensity level"

  Scenario: Verify Back button is visible
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then Back button should be visible

  Scenario: Verify Step 2 progress bar is filled
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then Progress bar should reflect Step 2 of 5 as filled

  Scenario: Verify presence of all 3 intensity options
    Given User is in step 1 for onboarding process
    When User clicks continue after filling form
    Then User should see options "Easy, Medium, Hard"
