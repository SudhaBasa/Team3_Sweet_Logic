Feature: Validation for Onboarding step 9

  Background: 
    User should have completed until step 7 in onboarding process


  Scenario: Verify allergy options are displayed for "yes" in step 8
    Given User is in step 8
    When User selects option yes
    Then User should see options Dairy, Gluten, Nuts, Shellfish, Soy, Eggs, Other, None in step 9

  Scenario: Verify user goes to step 10 if choose "no"
    Given User is in step 8
    When User selects option no
    Then User should be in step 10

  Scenario: Verify back button in step 9
    Given User is in step 8
    When User selects option yes in step 8
    Then User should see the back button in left down corner of the page

  Scenario: Verify title in step 9
    Given User is in step 8
    When User selects option yes in step 8
    Then User should see the title "Tap foods your body hates"

  Scenario: Verify subtext in step 9
    Given User is in step 8
    When User selects option yes in step 8
    Then User should see subtext "Select all that apply"

  Scenario: Confirm the progress bar displays "Step 9 of 12"
    Given User is in step 8
    When User selects option yes in step 8
    Then Progress bar should visually indicate "Step 9 of 12"
