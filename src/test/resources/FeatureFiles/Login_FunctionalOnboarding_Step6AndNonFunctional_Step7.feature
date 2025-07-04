Feature: Functional test for onboarding step 6 and non functional scenarios for step 7

  Background: 
    Given User should have completed until step fivee in onboarding process

  Scenario: Verify cuisine options
    Given User is in step six
    When User selects from the options in step six
    Then User should redirect to step seven

  Scenario: Verify options in step 7
    Given User is in step six
    When User selects from the options in step six
    Then User should see options on step seven "Indian 🍛, American 🍔, Continental 🥖, Mediterranean 🥙, Asian 🍜, Middle Eastern 🥙, Mexican 🌮" in step 7

  Scenario: Verify heading for step 7 is visible
    Given User is in step six
    When User selects from the options in step six
    Then User should see title on Step seven "What's your go-to food passport?"

  Scenario: Verify subtext for step 7 is visible
    Given User is in step six
    When User selects from the options in step six
    Then User should see subtext. "To create a meal plan you'll enjoy, please select your preferred cuisines!"

  Scenario: Confirm the progress bar displays "Step 7 of 12"
    Given User is in step six
    When User selects from the options in step six
    Then Progress bar should visually indicate "Step 7 of 12"

  Scenario: Verify back button is visible in step 7
    Given User is in step six
    When User selects from the options in step six
    Then User should see the back button in left down corner of the page
