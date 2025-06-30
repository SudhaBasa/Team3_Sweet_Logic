Feature: Home Page Validation for Registered premium Account User
Background: User is in password auth page 

  @Test
  Scenario: Verify order of text in navigation bar
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education
    
	@Test
  Scenario: Verify the presence of animation in challenge yourself button 
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see flashing challenge yourself button
    
  @Test
  Scenario: Verify the duration of animation
    Given User is in password auth page
    When User clicks sign in after entering password
    Then Flashes in 0.2s
    
	 @Test
  Scenario: Verify the presence of  Challenge yourself today button
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see a  "Challenge yourself today! " button
    
  @Test
  Scenario: Verify the presence of gender image in the grid
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see a gender-specific image based on the gender selected during the onboarding process
    
  @Test
  Scenario: Verify the presence of emoji on the top right of gender image
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see an emoji displayed on the top-right corner of the gender image
    
 @Test
  Scenario: Verify the presence of  label for gender image 
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see label "Mood:" below the gender image
    
   @Test
  Scenario: Verify the presence of log button
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see log button under gender image
    
   @Test
  Scenario: Verify display mood text based on emoji
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see mood text based on the emoji
    
   @Test
  Scenario: Verify the presence of Weekly plan button
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see Week plan button
    
   @Test
  Scenario: Verify the presence of "Record New Data" in the bottom
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see "Record New Data' text
    
   @Test
  Scenario: Verify the presence of 4 button option below Record New Data
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see 4 button options
    
   @Test
  Scenario: Verify the first button text " Blood Glucose"
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see text "Blood Glouce"
    
   @Test
  Scenario: Verify the second button text " Physical Activity"
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see " Physical activity"
    
   @Test
  Scenario: Verify the third button text " Food Intake"
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see "Food Intake"
    
   @Test
  Scenario: Verify the fourth button text " Medication"
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User Should see "Medication"
    
   @Test
  Scenario: Verify  icon for Blood Glucose
    Given User is in password auth page
    When User clicks sign in after entering password
    Then Activity icon should be present in blood glucose
    
   @Test
  Scenario: Verify icon for  Physical Activity
    Given User is in password auth page
    When User clicks sign in after entering password
    Then Running icon should be present in Physical activity
    
     @Test
  Scenario: Verify icon for Food Intake
    Given User is in password auth page
    When User clicks sign in after entering password
    Then Pizza icon should be present in food intake
    
     @Test
  Scenario: Verify  icon for Medication
    Given User is in password auth page
    When User clicks sign in after entering password
    Then Pill icon should be present in medication
    
 
    

    
   