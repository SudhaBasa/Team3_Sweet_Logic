Feature: Functional testing for Food Intake
Background: User Food Intake in tracker 
 
@Test
Scenario: Verify user able to save food entry with valid data
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks save food entry after entering valid   
  Then User should see "Food Entry is recorded"
  
  @Test
Scenario: Verify user able to save food entry with invalid value
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks save food entry button after entering invalid value in food name   
  Then User should see alert with message  "Failed to save food intake"
  
  @Test
Scenario: Verify custom field in serving size 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User selects custom option in serving size   
  Then User should see new input field added below the serving field
  
  @Test
Scenario: Verify user error message for invalid value in calorie using  calculator 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User enters invalid value in food name   
  Then User should see error message "Please enter valid food name"
  
  @Test
Scenario: Verify the presence of automatic calorie calculation in calorie field
  Given User is in the Breakfast section of the Food Intake Tracker
  When User enters valid food name   
  Then User should see calorie value for the food name calculated automatically
  
  @Test
Scenario: Verify the presence of helper text after automatic calorie calculation
  Given User is in the Breakfast section of the Food Intake Tracker
  When User enters valid food name    
  Then User should see helper text after automatic calorie calculation
  
  @Test
Scenario: Verify helper text after automatic calorie calculation
  Given User is in the Breakfast section of the Food Intake Tracker
  When User enters valid food name     
  Then User should see "Calories calculated automatically. You can edit if needed." as helper text in calorie field
  
  @Test
Scenario: Verify the automatic calorie value change after selecting serving size
  Given User is in the Breakfast section of the Food Intake Tracker
  When User changes serving size from the default value after entering the food name   
  Then User should see change value in calorie
  
  @Test
Scenario: Verify user able to edit the calorie value after automatic calorie calculation 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User edit calorie value after automatic calorie calculation   
  Then User should see edited value in automatic calorie value
  
  @Test
Scenario: Verify user able to save food entry with null value in food name 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks the Save Food Entry button after leaving the Food Name field empty   
  Then User should see an error message indicating that the Food Name is required
  
  @Test
Scenario: Verify datepicker option 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks on date field   
  Then User should see date calendar
  
  @Test
Scenario: Verify date in picker 
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks on date field   
  Then User should see today's date highlighted
  
  @Test
Scenario: Verify the presence the previous button  in date picker
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks on date field   
  Then User should see previous button in date
  
  @Test
Scenario: Verify the presence the Next button  in date picker
  Given User is in the Breakfast section of the Food Intake Tracker
  When  User clicks on date field   
  Then User should see next button in date
  
  @Test
Scenario: Verify user able to edit date in date picker
  Given User is in the Breakfast section of the Food Intake Tracker
  When  User selects previous date in the calendar after clicking date field  
  Then User should see selected date in the field
  
  @Test
Scenario: Verify user  receives error message for entering more than 250 words in notes
  Given User is in the Breakfast section of the Food Intake Tracker
  When User clicks save food entry after more than 250 words in notes   
  Then User should see error message in alert
  
  