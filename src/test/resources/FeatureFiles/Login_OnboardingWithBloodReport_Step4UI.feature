Feature: Onboarding Step 4 UI

  Background: 
    Given User should have completed until step 3


  Scenario: Verify option is selectable
    Given User is in step 4
    When User selects food passport
    Then User should navigate to step 5

  Scenario: Verify back button function
    Given User is in step 4
    When User clicks back button
    Then User should navigate to step 3

  Scenario: Verify Step 5 heading is visible
    Given User is in step 4
    When User selects food passport
    Then Page should display title "Allergic to any foods?"

  Scenario: Verify step 5 sub text
    Given User is in step 4
    When User selects food passport
    Then User should see sub text "Select all that apply"

  Scenario: Progress bar reflects Step 5 of 5
    Given User is in step 4
    When User selects food passport
    Then Progress bar should visually indicate "Step 5 of 5"

  Scenario: Verify Back button is visible
    Given User is in step 4
    When User selects food passport
    Then Back button should be visible

  Scenario: Verify checkbox for options
    Given User is in step 4
    When User selects food passport
    Then User should see check box in all options

  Scenario: Verify submit button visible
    Given User is in step 4
    When User selects food passport
    Then User should see "Submit" button

  Scenario: Verify options is displayed
    Given User is in step 4
    When User selects food passport
    Then User should see options labeled "Gluten, Eggs, Soy, Nuts, Dairy, Shellfish, Other, None"
