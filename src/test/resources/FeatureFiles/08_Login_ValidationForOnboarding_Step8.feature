Feature: Validation for onboarding step 8

  Background: 
    User should have completed until step 6 in onboarding process


  Scenario: Verify yes, no options are displayed in step 8
    Given User is in step 7
    When User selects from one of the cuisine options in step 7
    Then User should see options yes ✅, No ❌ in step 8

  Scenario: Verify heading for step 8 is visible
    Given User is in step 7
    When User selects from one of the cuisine options in step 7
    Then User should see title "Allergic to any foods?"

  Scenario: Verify subtext for step 8 is visible
    Given User is in step 7
    When User selects from one of the cuisine options in step 7
    Then User should see subtext "Select yes if you have any food allergies"

  Scenario: Verify back button is visible in step 8
    Given User is in step 7
    When User selects from one of the cuisine options in step 7
    Then User should see the back button in left down corner of the page

  Scenario: Confirm the progress bar displays "Step 8 of 12"
    Given User is in step 7
    When User selects from one of the cuisine options in step 7
    Then Progress bar should visually indicate "Step 8 of 12"
