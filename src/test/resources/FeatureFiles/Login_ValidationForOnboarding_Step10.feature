Feature: Validation for onboarding step 10

  Background: 
    Given User should have completed until step nine in onboarding process


  Scenario: Verify step 10 contains the list of other medical conditions
    Given User is in step nine
    When User clicks continue button
    Then User should see the option "High Blood Pressure, High Cholesterol, Heart Disease, PCOS (Polycystic Ovary Syndrome), Chronic kidney disease, Gastroesophageal reflux disease, Anemia, Hypothyroidism, Hyperthyroidism, None of the above"

  Scenario: Validate title in step 10
    Given User is in step nine
    When User clicks continue button
    Then User should see title on Step ten "Any medical quirks worth mentioning?"

  Scenario: Validate subtext in step 10
    Given User is in step nine
    When User clicks continue button
    Then User should see subtext "Do you have any other medical conditions?"
  												
  Scenario: Verify back button in step 10
    Given User is in step nine
    When User clicks continue button
    Then User should see the back button in left down corner of the page

  Scenario: Confirm the progress bar displays "Step 10 of 12"
    Given User is in step nine
    When User clicks continue button
    Then Progress bar should visually indicate "Step 10 of 12"
