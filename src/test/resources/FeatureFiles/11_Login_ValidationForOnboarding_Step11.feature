Feature: Validation for onboarding step 11

  Background: 
    User should have completed until step 9 in onboarding process


  Scenario: Verify user able to select multiple checkbox
    Given User is in step 10
    When User checks more than one checkbox
    Then User should see multiple checkbox selected

  Scenario: Verify step 11 contain options to choose
    Given User is in step 10
    When User clicks continue in step 10
    Then User should see options "Easy 🦋", "Medium 💪", "Hard 🔥"

  Scenario: Verify the title in step 11
    Given User is in step 10
    When User clicks continue in step 10
    Then User should see title "Pick your pace: chill stroll or marathon magic?"

  Scenario: Verify the subtext in step 11
    Given User is in step 10
    When User clicks continue in step 10
    Then User should see subtext "Select your preferred exercise intensity level"

  Scenario: Verify back button in step 11
    Given User is in step 10
    When User clicks continue in step 10
    Then User should see the back button in left down corner of the page

  Scenario: Confirm the progress bar displays "Step 11 of 12"
    Given User is in step 10
    When User clicks continue in step 10
    Then Progress bar should visually indicate "Step 11 of 12"
