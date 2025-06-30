Feature: Food Intake Validation
Background: User is in home page after logged  into app

@Test
Scenario: Verify title in Food Intake form 
  Given User is in home page
  When User clicks Food Intake   
  Then User should see title "Food Intake Tracker"

@Test
Scenario: Verify subtext in form
  Given User is in home page
  When User clicks Food Intake   
  Then User should see subtext "Track what you eat to manage your diabetes better"

@Test
Scenario: Verify the presence of  4 tabs in food intake
  Given User is in home page
  When User clicks Food Intake   
  Then User should see "Breakfast, Lunch, dinner, snack" tabs

@Test
Scenario: Verify fields in food intake form
  Given User is in home page
  When User clicks Food Intake   
  Then User should see field for Food Name, Serving Size,Calories,Date,Notes

@Test
Scenario: Verify default meal tab selection
  Given User is in home page
  When User clicks Food Intake   
  Then User should see "Breakfast" tab selected by default

@Test
Scenario: Verify input field for food name
  Given User is in home page
  When User clicks Food Intake   
  Then User should see input field for field food name 

@Test
Scenario: Verify the presence of placeholder in input field
  Given User is in home page
  When User clicks Food Intake   
  Then User should see text " e.g., Grilled Chicken Salad" as placeholder in input field

@Test
Scenario: Verify the presence of dropdown for serving size
  Given User is in home page
  When User clicks Food Intake   
  Then User should see  dropdown for serving size

@Test
Scenario: Verify Serving Size default value
  Given User is in home page
  When User clicks Food Intake   
  Then User should see  "Medium (1 cup)"as the default value in the Serving Size dropdown

@Test
Scenario: Verify the dropdown options for serving size
  Given User is in home page
  When User clicks Food Intake   
  Then User should see  Small (1/2 cup),Medium (1 cup),Large (2 cups),Custom

@Test
Scenario: Verify the presence calculator icon in calorie
  Given User is in home page
  When User clicks Food Intake   
  Then User should see calculator icon in calorie

@Test
Scenario: Verify the input field for calorie
  Given User is in home page
  When User clicks Food Intake   
  Then User should see input field for calorie

@Test
Scenario: Verify the placeholder text for calorie
  Given User is in home page
  When User clicks Food Intake   
  Then User should see text "eg.250" as placeholder in calorie field

@Test
Scenario: Verify helper text below Calories field
  Given User is in home page
  When User clicks Food Intake   
  Then User should see helper text "Enter calories or click the calculator icon for automatic calculation." 

@Test
Scenario: Verify the date picker option
  Given User is in home page
  When User clicks Food Intake   
  Then User should see date picker 

@Test
Scenario: Verify Date field default value
  Given User is in home page
  When User clicks Food Intake   
  Then User should see "June 26th, 2025" displayed in the Date field

@Test
Scenario: Verify the presence of input block for notes
  Given User is in home page
  When User clicks Food Intake   
  Then User should see input block for notes

@Test
Scenario: Verify the presence of placeholder in notes blocks
  Given User is in home page
  When User clicks Food Intake   
  Then User should see text "Add any additional information..." in place holder

@Test
Scenario: Verify the save food entry button
  Given User is in home page
  When User clicks Food Intake   
  Then User should see save food entry button

