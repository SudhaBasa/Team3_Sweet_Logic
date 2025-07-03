Feature: Validation for onboarding step 8

  Background: 
    Given User should have completed until step six in onboarding process

  Scenario: Verify yes, no options are displayed in step 8
    Given User is in step seven
    When User selects from one of the cuisine options in step seven
    Then User should see options "Yes ✅, No ❌" in step eight

  Scenario: Verify heading for step 8 is visible
    Given User is in step seven
    When User selects from one of the cuisine options in step seven
    Then User should see title on Step eight "Allergic to any foods?"   
    #when trying to find xpath for heading..it has xpath of heading on step 10
    

  Scenario: Verify subtext for step 8 is visible
    Given User is in step seven
    When User selects from one of the cuisine options in step seven
    Then User should see subtext "Select yesif you have any food allergies"

  Scenario: Verify back button is visible in step 8
    Given User is in step seven
    When User selects from one of the cuisine options in step seven
    Then User should see the back button in left down corner of the page

  Scenario: Confirm the progress bar displays "Step 8 of 12"
    Given User is in step seven
    When User selects from one of the cuisine options in step seven
    Then Progress bar should visually indicate "Step 8 of 12"
