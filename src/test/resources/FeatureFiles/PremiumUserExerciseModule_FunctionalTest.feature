Feature: Functional Testing of Exercise Module on Homepage

Background: User is Logged into the app
Given User is Logged into the app

#################################################################

Scenario: Verify "View Full Schedule" button is displayed
Given User is on the homepage
When User clicks the "Exercise" option from the side panel 
Then "View Full Schedule" button is displayed on the right

#################################################################

Scenario: Verify navigation to "Today's Exercise Schedule" page
Given User is on the homepage
When User clicks the "View Full Schedule" button 
Then User is redirected to "Today's Exercise Schedule" page

#############################################################

Scenario Outline: Verify the tab is displayed
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then user should see Excercise tabs "<Tabs>" 

 Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |
     
################################################################

Scenario Outline: Verify Exercise name is displayed under tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then user should see "<Exercise name>" for all tabs

 Examples:

       |Exercise name          							|
       |Gentle Arm Circles & Leg Swings    	|
       |Light Walking & Gentle Yoga  				|
       |Static Stretching     			        |

#################################################################

Scenario Outline: Verify Exercise description is displayed under tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Exercise Description>" is shown under the Exercise tab

Examples:

       |Exercise Description          							|
       |Improves blood flow and joint mobility, preparing the body for light activity. Arm circles warm up the shoulders, while leg swings activate the hip flexors and hamstrings.    |
       |Combines low-impact cardiovascular exercise with flexibility and balance work. Walking helps improve insulin sensitivity and blood sugar control, while yoga enhances circulation and reduces stress. Given the low glucose level of 4mg/dL, it's CRUCIAL to consume a fast-acting carbohydrate source (e.g., glucose tablets or juice) BEFORE starting this workout and monitor blood glucose frequently. 			|
       |Slowly and gently stretch major muscle groups, holding each stretch for 20-30 seconds. Focus on hamstrings, quads, calves, chest, and shoulders. Improves flexibility and reduces muscle soreness.     							|

#################################################################

Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Warm Up" tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Warm Up" tab

Examples:

       |Duration      				|Calories  			|Intensity Level   |
       |Duration: 5 minutes   |Calories: 25   |Intensity: Low    |
     
#################################################################

Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Main Workout" tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Main Workout" tab

Examples:

       |Duration      				 |Calories  			 |Intensity Level   |
       |Duration: 30 minutes   |Calories: 175    |Intensity: Low    |
       
#################################################################

Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Cool Down" tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Cool Down" tab

Examples:

       |Duration      				 |Calories  			|Intensity Level   |
       |Duration: 10 minutes   |Calories: 50    |Intensity: Low    |

#################################################################

Scenario Outline: Verify "Mark As Completed" button is displayed         
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "Mark as Completed" button is displayed for all three "<Tabs>" sections

Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |

#################################################################

Scenario Outline: Verify success dialog is shown after marking as completed     // Not working 
Given User is on the homepage
When User clicks the "Mark As Completed" button for all three "<Tabs>" sections
Then Success dialog is shown for all three "<Tabs>" sections

Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |
       
#################################################################
   
Scenario Outline: Verify button status changes to "Completed"       // Not working 
Given User is on the homepage
When User clicks the "Mark As Completed" button for all three sections
Then Button changes to "Completed" all three "<tab>" sections

Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |

#################################################################

Scenario Outline: Verify undo option is displayed after marking completed
Given User is on the homepage
When User clicks the "Mark As Completed" button for all three sections
Then "Undo" option is visible for all three "<tab>" sections

Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |

#################################################################






