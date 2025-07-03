Feature: Functional Testing of Exercise Module on Homepage

Background: User is Logged into the app

Scenario: Verify "View Full Schedule" button is displayed
Given User is on the homepage
When User clicks the "Exercise" option from the side panel 
Then "View Full Schedule" button is displayed on the right

Scenario: Verify navigation to "Today's Exercise Schedule" page
Given User is on the homepage
When User clicks the "View Full Schedule" button 
Then User is redirected to "Today's Exercise Schedule" page
################################################################

Scenario Outline: Verify the tab is displayed
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then user should see tabs "<Tabs>"

 Examples:

       |Tabs          |
       |Warm Up    	  |
       |Main Workout  |
       |Cool Down     |
     
###################################################################

Scenario Outline: Verify Exercise name is displayed under tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then user should see "<Exercise name>"

 Examples:

       |Exercise name          										|
       |Gentle Arm Circles & Leg Swings    				|
       |Light Walking & Gentle Stretching  				|
       |Seated Breathing & Gentle Twists     			|

####################################################################

Scenario Outline: Verify Exercise description is displayed under tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Exercise Description>" is shown under the Exercise tab

Examples:

       |Exercise Description          							|
       |Light arm circles forward and backward, followed by gentle leg swings forward and sideways to improve circulation and prepare muscles for activity. Focus on controlled movements.    |
       |A combination of slow-paced walking and gentle stretching exercises. Start with 20 minutes of walking at a comfortable pace, followed by static stretches like hamstring stretches, calf stretches, and shoulder stretches. Hold each stretch for 20-30 seconds. 			|
       |Seated deep breathing exercises to lower heart rate and relax the body. Followed by gentle spinal twists to improve flexibility. Inhale deeply, exhale slowly.     							|

####################################################################

Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Warm Up" tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Warm Up" tab

Examples:

       |Duration      				|Calories  			|Intensity Level   |
       |Duration: 10 minutes  |Calories: 30   |Intensity: Low    |
     
####################################################################

Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Main Workout" tab
Given User is on the homepage
When User clicks the "Exercise" option from the side panel
Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Main Workout" tab

Examples:

       |Duration      				 |Calories  			 |Intensity Level   |
       |Duration: 25 minutes  |Calories: 170   |Intensity: Low    |
       #
####################################################################
#
#Scenario Outline: Verify Duration,Calories,Intensity level is displayed under "Cool Down" tab
#Given User is on the homepage
#When User clicks the "Exercise" option from the side panel
#Then "<Duration>","<Calories>","<Intensity Level>" is displayed under "Cool Down" tab

#Examples:
#
       #|Duration      				 |Calories  			|Intensity Level   |
       #|Duration: 10 minutes  |Calories: 50   |Intensity: Low   |
#
####################################################################
#
#Scenario Outline: Verify "Mark As Completed" button is displayed          // Not working
#Given User is on the homepage
#When User clicks the "Exercise" option from the side panel
#Then "Mark as Completed" button is displayed for all three "<Tabs>" sections
#
#Examples:
#
       #|Tabs          |
       #|Warm Up    	  |
       #|Main Workout  |
       #|Cool Down     |
#
#Scenario Outline: Verify success dialog is shown after marking as completed     // Not working 
#Given User is on the homepage
#When User clicks the "Mark As Completed" button for all three "<Tabs>" sections
#Then Success dialog is shown for all three "<Tabs>" sections
#
#Examples:
#
       #|Tabs          |
       #|Warm Up    	 |
       #|Main Workout  |
       #|Cool Down     |
#
#Scenario Outline: Verify button status changes to "Completed"
#Given User is on the homepage
#When User clicks the "Mark As Completed" button for all three sections
#Then Button changes to "Completed" all three "<tab>" sections
#
#Examples:
#
       #|Tabs          |
       #|Warm Up    	 |
       #|Main Workout  |
       #|Cool Down     |
#
#Scenario Outline: Verify undo option is displayed after marking completed
#Given User is on the homepage
#When User clicks the "Mark As Completed" button for all three sections
#Then Undo option is visible for all three "<tab>" sections
#
#Examples:
#
       #|Tabs          |
       #|Warm Up    	 |
       #|Main Workout  |
       #|Cool Down     |

