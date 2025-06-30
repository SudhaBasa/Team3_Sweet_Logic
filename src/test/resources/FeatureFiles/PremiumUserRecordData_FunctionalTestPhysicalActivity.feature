Feature: Functional testing for physical activity
Background: User physical activity in tracker

@Test
Scenario: Verify user able to save activity
  Given User is in physical activity
  When User clicks save activity after entering valid
  Then User should see "Your activity is recorded"

@Test
Scenario: Verify user unable to enter invalid value
  Given User is in physical activity
  When User enters invalid value in duration text field  
  Then User should see blank 

@Test
Scenario: Verify datepicker option 
  Given User is in physical activity
  When User clicks date picker   
  Then User should see date calendar

@Test
Scenario: Verify date in picker
  Given User is in physical activity
  When User clicks date picker   
  Then User should see today's date highlighted

@Test
Scenario: Verify the presence the previous button  in date picker
  Given User is in physical activity
  When User clicks date picker   
  Then User should see previous button in date

@Test
Scenario: Verify the presence the Next button  in date picker
  Given User is in physical activity
  When User clicks date picker   
  Then User should see next button in date



