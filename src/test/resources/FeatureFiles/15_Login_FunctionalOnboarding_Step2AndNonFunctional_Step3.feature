Feature: Functional test for Onboarding Step 2 and non functional scenarios for Step 3

  Background: 
    Given User should have completed until step 1 in onboarding process


  #Scenario: Verify back button function in Step 2
    #Given User is in step two.
    #When User clicks back button in step two.
    #Then User should redirected to step one.

  #Scenario: Verify option is selectable
    #Given User is in step two.
    #When User selects a gender in step two.
    #Then User should navigate to step three

  #Scenario: Verify Step 3 heading is visible
    #Given User is in step two.
    #When User selects a gender in step two.
    #Then Page should display title on Step three "Age: own it, pick your number."

  #Scenario: Verify step 3 sub text
    #Given User is in step two.
    #When User selects a gender in step two.
    #Then User should see sub text on step three "Please select your age"
#
  #Scenario: Progress bar reflects Step 3 of 12
    #Given User is in step two.
    #When User selects a gender in step two.
   #Then Progress bar should visually indicate on step three "Step 3 of 12"

  #Scenario: Verify Back button is visible in step 3
    #Given User is in step two.
    #When User selects a gender in step two.
    #Then Back button should be visible

  Scenario: Verify user should able to scroll the iframe to see options
    Given User is in step two.
    When User selects a gender in step two.
    Then iframe options should have scroll option

  Scenario: Verify options is displayed in step 3
    Given User is in step two.
    When User selects a gender in step two.
    Then User should see options for age "18 years to 100 years"
