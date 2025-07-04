Feature: Validation for Onboarding step 9

  Background: 
    Given User should have completed until step seven in onboarding process


  Scenario: Verify allergy options are displayed for "yes" in step 8
    Given User is in step eight
    When User selects option yes
    Then User should see options "Dairy, Gluten, Nuts, Shellfish, Soy, Eggs, Other, None" in step 9

  Scenario: Verify user goes to step 10 if choose "no"
    Given User is in step eight
    When User selects option no
    Then User should be in step ten

  Scenario: Verify back button in step 9
    Given User is in step eight
    When User selects option yes in step eight
    Then User should see the back button in left down corner of the page

  Scenario: Verify title in step 9
    Given User is in step eight
    When User selects option yes in step eight
    Then User should see the title on step nine "Tap foods your body hates"

  Scenario: Verify subtext in step 9
    Given User is in step eight
    When User selects option yes in step eight
    Then User should see subtext. "Select all that apply"

  Scenario: Confirm the progress bar displays "Step 9 of 12"
    Given User is in step eight
    When User selects option yes in step eight
    Then Progress bar should visually indicate "Step 9 of 12"
