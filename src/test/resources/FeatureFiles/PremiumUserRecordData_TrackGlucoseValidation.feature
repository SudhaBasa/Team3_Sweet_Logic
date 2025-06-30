Feature: Track Glucose Validation
Background: User is in home page after logged  into app 
    
@Test
Scenario: Verify title in blood glucose form
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see title "Track Glucose"
  
@Test
Scenario: Verify subtext in form
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see subtext " Keep your health in check"
  
@Test
Scenario: Verify fields in track glucose 
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see field for Blood Glucose Level, Reading Type,Date
  
@Test
Scenario: Verify input field 
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see text field for blood glucose
  
@Test
Scenario: Verify the placeholder input in blood glucose field
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see text "Enter blood glucose level"
  
@Test
Scenario: Verify the text in the input field
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see "mg/dL"
  
@Test
Scenario: Verify the presence of transition field in track glucose
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see three transition details  with text "Low, normal, high"
  
@Test
Scenario: Verify the color of transition in Low
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see Red color in low
  
@Test
Scenario: Verify the color of transition in normal
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see green color in normal
  
@Test
Scenario: Verify the color of transition in height
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see yellow color in high
  
@Test
Scenario: Verify the four button below reading type
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see button "Fasting,Pre-meal,Post-meal,Bedtime"
  
@Test
Scenario: Verify the date picker option
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see date picker 
  
@Test
Scenario: Verify the last reading time
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see last ready details
  
@Test
Scenario: Verify the record reading button
  Given User is in home page
  When User clicks Blood Glucose 
  Then User should see record reading button
  


    