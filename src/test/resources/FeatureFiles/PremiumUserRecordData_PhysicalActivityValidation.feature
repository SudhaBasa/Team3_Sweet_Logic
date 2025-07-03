Feature: Physical activity Validation
Background: User is in home page after logged  into app

Scenario: Verify title in physical activity form
  Given User is in home page
  When  User clicks physical activity 
  Then User should see title "Physical Activity"

Scenario: Verify subtext in form
  Given User is in home page
  When  User clicks physical activity 
  Then User should see subtext "Track your fitness journey"

Scenario: Verify fields in track glucose 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see field for Activity Type, Duration,Date,Intensity

Scenario: Verify the presence of dropdown for Activity Type 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  dropdown for activity type

Scenario: Verify the dropdown options for activity type 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  "Walking,Running,Cycling,Weight Training,Yoga,HIIT,Other"

Scenario: Verify the presence input for Duration 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  input field for duration

Scenario: Verify the placeholder text for Duration
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "30" in placeholder field

Scenario: Verify dropdown for duration options
  Given User is in home page
  When  User clicks physical activity 
  Then User should see drop down duration 

Scenario: Verify droption option in duration
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "minutes, hours"

Scenario: Verify the date picker option
  Given User is in home page
  When  User clicks physical activity 
  Then User should see date picker 

Scenario: Verify the presence of intensity
  Given User is in home page
  When  User clicks physical activity 
  Then User should see intensity field

Scenario: Verify buttons for intensity
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "Light, Moderate,Vigorous"

Scenario: Verify the save activity button
  Given User is in home page
  When  User clicks physical activity 
  Then User should see save activity button


