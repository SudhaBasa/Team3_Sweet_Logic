Feature: Exercise schedule 

Background: User is in home page after logging 


Scenario: Verify button reverts back after undo
Given User is in the Exercise section 
When User clicks Undo after marking Exercise as completed 
Then Button changes back to "Mark As Completed"

Scenario: Verify navigation to "View full schedule'
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then User should redirect to Exercise schedule

Scenario: Verify page title is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then User should see title "Today's Exercise Schedule"

Scenario: Verify "Back to Home" button is visible
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then User should see "Back to Home" button in Today's Exercise schedule page

Scenario: Verify "Warm Up" section is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "Warm Up" section should be visible

Scenario: Verify warm-up exercise name
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise name should be visible

Scenario: Verify warm-up exercise description
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise description should be visible

Scenario: Verify warm-up duration
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise durations should be visible

Scenario: Verify warm-up calories
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise calories should be visible

Scenario: Verify warm-up intensity
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise intensity should be visible

Scenario: Verify "Main Workout" section is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "Main Workout" section should be visible

Scenario: Verify Main Workout exercise name
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise name should be visible

Scenario: Verify Main Workout exercise description
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise description should be visible

Scenario: Verify Main Workout duration
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise durations should be visible

Scenario: Verify Main Workout calories
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise calories should be visible

Scenario: Verify Main Workout intensity
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise intensity should be visible

Scenario: Verify "Cool Down" section is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "Cool Down" section should be visible

Scenario: Verify Cool Down exercise name
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise name should be visible

Scenario: Verify Cool Down exercise description
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise description should be visible

Scenario: Verify Cool Down duration
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise durations should be visible

Scenario: Verify Cool Down calories
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise calories should be visible

Scenario: Verify Cool Down intensity
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise intensity should be visible

Scenario: Verify the intensity value
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then Exercise intensity should low/medium/hard

Scenario: Verify total duration is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then total duration should be displayed

Scenario: Verify total duration matches the sum of individual workout durations
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then total duration should equal the sum of all individual durations

Scenario: Verify total calories matches the sum of individual workout calories
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then total calories should equal the sum of all individual calories