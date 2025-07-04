Feature: Onboarding Step 3 UI

  Background: 
    Given User should have completed until step 2


  Scenario: Verify option is selectable
    Given User is in step 3
    When User selects dietary preference
    Then User should navigate to step 4

  Scenario: Verify back button function
    Given User is in step 3
    When User clicks back button
    Then User should navigate to step 2

  Scenario: Verify Step 4 heading is visible
    Given User is in step 3
    When User selects dietary preference
    Then Page should display title "What's your go-to food passport?"

  Scenario: Verify step 4 sub text
    Given User is in step 3
    When User selects dietary preference
    Then User should see sub text "To create a meal plan you'll enjoy, please select your preferred cuisines!"

  Scenario: Progress bar reflects Step 4 of 5
    Given User is in step 3
    When User selects dietary preference
    Then Progress bar should visually indicate "Step 4 of 5"

  Scenario: Verify Back button is visible
    Given User is in step 3
    When User selects dietary preference
    Then Back button should be visible

  Scenario: Verify options is displayed
    Given User is in step 3
    When User selects dietary preference
    Then User should see options labeled "Indian, American, Continental, Mediterranean, Asian, Middle Eastern, Mexican"
