Feature: Functional testing for track glucose
Background: User blood glucose in tracker 

@Test
Scenario: Verify user able to record reading
  Given User is in blood glucose
  When User clicks record reading after valid reading 
  Then User should see "Reading successfully recorded!"
  
  
@Test
Scenario: Verify user unable to enter invalid value
  Given User is in blood glucose
  When  User enters invalid value in blood glucose
  Then User should see blank value 
  
  
@Test
Scenario: Verify transition details highlights 
  Given User is in blood glucose
  When  User enters value in blood glucose
  Then User should see transition details highlights
  
  
@Test
Scenario: Verify datepicker option 
  Given User is in blood glucose
  When  User clicks date picker 
  Then User should see date calendar
  
  
@Test
Scenario: Verify date in picker
  Given User is in blood glucose
  When  User clicks date picker 
  Then User should see today's date highlighted
  
  
@Test
Scenario: Verify the presence the previous button  in date picker
  Given User is in blood glucose
  When  User clicks date picker 
  Then User should see previous button in date
  
  
@Test
Scenario: Verify the presence the Next button  in date picker
  Given User is in blood glucose
  When  User clicks date picker 
  Then User should see next button in date
  
  