Feature: Functional test for Onboarding Step 5 and non functional scenarios for Step 6

  Background: 
    Given User should have completed until step five in onboarding process

  Scenario: Validate notification message for weight option less than 59
    Given User is in step five
    When User selects a weight option less than 59
    Then User should see notification text. "Light as a feather! But don't worry, our recipes will keep you grounded. 🪶"

  Scenario: Validate notification message for weight option between 60-84
    Given User is in step five
    When User selects a weight option between 60-84
    Then User should see step five notification text "Perfectly balanced, as all things should be! ⚖️"

  Scenario: Validate notification message for weight option greater than 85
    Given User is in step five
    When User selects a weight option greater than 85
    Then User should see notification textt. "More of you to love! And more energy to power those workouts. 💪"

  Scenario: Validate user able to select from option in kilogram
    Given User is in step five
    When User selects from options available in kilogram
    Then User should redirect to Step six

  Scenario: Verify the functionality of the Back button in Step 5
    Given User is in step five
    When User clicks back button in step 5
    Then User should redirect to Step 4

  Scenario: Validate user able to select from option in pound
    Given User is in step five
    When User selects from options available in pound
    Then User should redirect to Step six

  Scenario: Ensure the heading for Step 6 is visible
    Given User is in step five
    When User selects from options available in pound
    Then Page should display title on page six "Your taste buds—what team are they on?"

  Scenario: Verify the subtext displayed in Step 6
    Given User is in step five
    When User selects from options available in pound
    Then User should see sub text on step six "Select your dietary preference"

  Scenario: Confirm the progress bar displays "Step 6 of 12"
    Given User is in step five
    When User selects from options available in pound
    Then Progress bar should visually indicate "Step 6 of 12"

  Scenario: Check that the Back button is visible in Step 6
    Given User is in step five
    When User selects from options available in pound
    Then Back button should be visible in step 6

  Scenario: Ensure Step 6 contains options to select dietary preference
    Given User is in step five
    When User selects from options available in pound
    Then User should see options labeled on step six "All-inclusive diet 🍴🍖🍎, Vegetarian 🥗🍆🥕, Vegan 🥬🌱🌿"
