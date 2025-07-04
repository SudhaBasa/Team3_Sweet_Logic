Feature: Exercise schedule 

Background: User is in home page after logging 
Given User is Logged into the app

#################################################################

Scenario: Verify button reverts back after undo
Given User is in the Exercise section 
When User clicks Undo after marking Exercise as completed 
Then Button changes back to "Mark as Completed"

#################################################################

Scenario: Verify page title is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then User should see title "Today's Exercise Schedule"

#################################################################

Scenario: Verify "Back to Home" button is visible
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then User should see "Back to Home" button in Today's Exercise schedule page

#################################################################

Scenario: Verify "Warm Up" section is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "Warm Up" section should be visible

#################################################################

Scenario Outline: Verify Exercise name is displayed under tab
Given User is in the Exercise section 
When  User clicks "view full schedule" 
Then "<Exercise name>" should be visible

 Examples:

       |Exercise name          										|
       |Gentle Arm Circles & Leg Swings    				|
       |Light Walking & Gentle Yoga  							|
       |Static Stretching     										|

#################################################################
 
Scenario Outline: Verify exercise description is displayed under tab
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "<Exercise description>" should be visible for all three sections
Examples:

       |Exercise description          							|
       |Improves blood flow and joint mobility, preparing the body for light activity. Arm circles warm up the shoulders, while leg swings activate the hip flexors and hamstrings.    |
       |Combines low-impact cardiovascular exercise with flexibility and balance work. Walking helps improve insulin sensitivity and blood sugar control, while yoga enhances circulation and reduces stress. Given the low glucose level of 4mg/dL, it's CRUCIAL to consume a fast-acting carbohydrate source (e.g., glucose tablets or juice) BEFORE starting this workout and monitor blood glucose frequently. 			|
       |Slowly and gently stretch major muscle groups, holding each stretch for 20-30 seconds. Focus on hamstrings, quads, calves, chest, and shoulders. Improves flexibility and reduces muscle soreness.     							|

#################################################################

Scenario Outline: Verify exercise duration is displayed 
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "<Exercise durations>" should be visible for all sections
Examples:

       |Exercise durations     |
       |Duration: 5 minutes    |
       |Duration: 30 minutes   |
       |Duration: 10 minutes   |

#################################################################

Scenario Outline: Verify exercise calories is displayed 
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then user should see "<Exercise calories>" for all sections
Examples:

       |Exercise calories     |
       |Calories: 25    			|
       |Calories: 175   			|
       |Calories: 50   				|

#################################################################

Scenario Outline: Verify exercise intensity is displayed 
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then user should see "<Exercise intensity>" as per "<Tabs>"
Examples:

       |Exercise intensity |Tabs          |
       |Intensity: Low    |Warm Up    	  |
       |Intensity: Low    |Main Workout  |
       |Intensity: Low    |Cool Down     |
       
#################################################################

Scenario: Verify total duration is displayed
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then "Total Duration" should be displayed

#################################################################

Scenario: Verify total duration matches the sum of individual workout durations      // Not implemented
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then total duration should equal the sum of all individual durations

#################################################################

Scenario: Verify total calories matches the sum of individual workout calories        // Not implemented
Given User is in the Exercise section 
When User clicks "view full schedule" 
Then total calories should equal the sum of all individual calories

#################################################################





