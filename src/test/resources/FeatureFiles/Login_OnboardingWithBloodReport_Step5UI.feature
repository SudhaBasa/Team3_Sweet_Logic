Feature: Onboarding Step 5 UI

  Background: 
    User should have completed until step 5


  Scenario: Verify back button function
    Given User is in step 5
    When User clicks back button
    Then User should navigate to step 4

  Scenario: Verify single selection in allergy
    Given User is in step 5
    When User selects single allergy and clicks submit
    Then User should navigate to subscription details

  Scenario: Verify multiple selection in allergy
    Given User is in step 5
    When User selects multiple allergies and clicks submit
    Then User should navigate to "Upgrade to premium plus"
