Feature: Functional scenarios for Step and non functional scenarios for Step 2

  Background: 
    Given User should clicked steps for onboarding button in upload page.


  #Scenario: Verify option is selectable
    #Given User is in step 1.
    #When User selects the condition in step 1.
   #Then User should navigate to step 2.
#
  #Scenario: Verify message after selecting condition in step 1
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then User should receive message "No worries, we're here to figure it out together! 🔍".

  #Scenario: Verify presence of back button in step 2
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then User should see back button in step 2

  #Scenario: Verify Step 2 heading is visible
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then Page should display title heading - "Which fabulous label fits you best?"

  #Scenario: Verify step 2 sub text
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then Page should have sub text on Step2 "Choose your gender"

  #Scenario: Verify step 2 progress is highlighted
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then Step two indicator should be highlighted

  #Scenario: Progress bar reflects Step 2 of 12
    #Given User is in step 1.
    #When User selects the condition in step 1.
    #Then Progress bar should visually indicate on step two "Step 2 of 12"

  Scenario: Verify gender options
    Given User is in step 1.
    When User selects the condition in step 1.
    Then User should see options labeled "Male 👨‍🦱, Female 👩‍🦰, Other ⚧️"
