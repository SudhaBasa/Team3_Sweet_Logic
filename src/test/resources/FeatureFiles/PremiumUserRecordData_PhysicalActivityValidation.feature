Feature: Physical activity Validation
Background: User is in home page after logged  into app

@Test
Scenario: Verify title in physical activity form
  Given User is in home page
  When  User clicks physical activity 
  Then User should see title "Physical Activity"

@Test
Scenario: Verify subtext in form
  Given User is in home page
  When  User clicks physical activity 
  Then User should see subtext "Track your fitness journey"

@Test
Scenario: Verify fields in track glucose 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see field for Activity Type, Duration,Date,Intensity

@Test
Scenario: Verify the presence of dropdown for Activity Type 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  dropdown for activity type

@Test
Scenario: Verify the dropdown options for activity type 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  "Walking,Running,Cycling,Weight Training,Yoga,HIIT,Other"

@Test
Scenario: Verify the presence input for Duration 
  Given User is in home page
  When  User clicks physical activity 
  Then User should see  input field for duration

@Test
Scenario: Verify the placeholder text for Duration
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "30" in placeholder field

@Test
Scenario: Verify dropdown for duration options
  Given User is in home page
  When  User clicks physical activity 
  Then User should see drop down duration 

@Test
Scenario: Verify droption option in duration
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "minutes, hours"

@Test
Scenario: Verify the date picker option
  Given User is in home page
  When  User clicks physical activity 
  Then User should see date picker 

@Test
Scenario: Verify the presence of intensity
  Given User is in home page
  When  User clicks physical activity 
  Then User should see intensity field

@Test
Scenario: Verify buttons for intensity
  Given User is in home page
  When  User clicks physical activity 
  Then User should see "Light, Moderate,Vigorous"

@Test
Scenario: Verify the save activity button
  Given User is in home page
  When  User clicks physical activity 
  Then User should see save activity button


