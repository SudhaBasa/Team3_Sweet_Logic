Feature: Functional test for Onboarding Step three and non functional scenarios for Step 4

  Background: 
    Given User should have completed until Step two in onboarding process


  #Scenario: Verify user able to select the age options
    #Given User is in step three
    #When User selects any age option in step three
    #Then User should navigate to step four
#
#
  #Scenario: Validate notification message for age 18-29
    #Given User is in step three
    #When User selects age option between 18-29
    #Then User should see notification message "Young and ready to conquer! 🚀"
#
  #Scenario: Validate notification message for age 30-49
    #Given User is in step three
    #When User selects age option betweenn 30-49
    #Then User should see notification messagee "In your prime and crushing it! 💫"
#
  #Scenario: Validate notification message for age above 50
    #Given User is in step three
    #When User selects age option above 50
    #Then User should see notification messsage "Age is just a number, and you're numbering it well! 🎯"
#
  #Scenario: Verify back button function in Step three
    #Given User is in step three
    #When User clicks back button in step three
    #Then User should redirected to step 2
#
  #Scenario: Verify Step 4 heading is visible
    #Given User is in step three
    #When User selects any age option in step three
    #Then Page should display title on step four "How close are you to the clouds?"
#
  #Scenario: Verify step 4 sub text
    #Given User is in step three
    #When User selects any age option in step three
    #Then User should see sub text on step four "Please enter your height"
#
  #Scenario: Progress bar reflects Step 4 of 12
    #Given User is in step three
    #When User selects any age option in step three
    #Then Progress bar should visually indicate on step four "Step 4 of 12"
#
  #Scenario: Verify Back button is visible in step 4
    #Given User is in step three
    #When User selects any age option in step three
    #Then Back button should be visible in step four
#
  #Scenario: Verify step 4 has 2 tabs to select height
    #Given User is in step three
    #When User selects any age option in step three
    #Then 2 tab option should be present
#
  #Scenario: Verify 1st tab in step 4
    #Given User is in step three
    #When User selects any age option in step three
    #Then 1st tab should have Centimeters

  Scenario: Verify 2nd tab in step 4
    Given User is in step three
    When User selects any age option in step three
    Then 2nd tab should have Feet & Inches

  #Scenario: Validate values for centimeters options
    #Given User is in step three
    #When User selects any age option in step three
    #Then Centimeters option should have 120 to 220 cm
#
  #Scenario: Validate values for inches options
    #Given User is in step three
    #When User selects any age option in step three
    Then Inches options should have 4'5" to 7'3"
